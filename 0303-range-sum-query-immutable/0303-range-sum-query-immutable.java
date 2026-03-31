class NumArray {
    int seg[];
    int n;
    public NumArray(int[] nums) {
         n=nums.length;
        seg=new int[4*n];

        build(0,n-1,0,nums);

    }
    public void build(int l,int r,int i,int nums[]){
        if(l==r){
            seg[i]=nums[l];
            return;
        }

        int mid=l+(r-l)/2;


        build(l,mid,2*i+1,nums);
        build(mid+1,r,2*i+2,nums);

        seg[i]=seg[2*i+1]+seg[2*i+2];
    }
    
    public int sumRange(int left, int right) {

        return sum(left,right,0,0,n-1);


        
    }
    public int sum(int st,int end,int i,int l,int r){

        if(st>r || end<l){
            return 0;

        }

        if(st<=l && end>=r){
            return seg[i];

        }
        int mid=l+(r-l)/2;
        return sum(st,end,2*i+1,l,mid) + sum(st,end,2*i+2,mid+1,r);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
