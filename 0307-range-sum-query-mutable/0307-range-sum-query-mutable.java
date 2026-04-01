class NumArray {
    int seg[];
    int nums[];
    public NumArray(int[] nums) {
        this.nums=nums;
        int n=nums.length;
        seg=new int[4*n];
        build(nums,0,n-1,0);
    }

    public void build(int nums[],int l,int r,int i){
        if(l==r){
            seg[i]=nums[l];
            return;
        }

        int mid=l+(r-l)/2;
        build(nums,l,mid,2*i+1);
        build(nums,mid+1,r,2*i+2);

        seg[i]=seg[2*i+1]+seg[2*i+2];
    }
    
    public void update(int index, int val) {
        upd(index,val,0,nums.length-1,0);
        
    }
    public void upd(int ind,int val,int l,int r,int i){
        if(l==r){
            seg[i]=val;
            return;
        }
        int mid=l+(r-l)/2;
        if(ind<=mid){
            upd(ind,val,l,mid,2*i+1);

        }
        else{
            upd(ind,val,mid+1,r,2*i+2);

        }

        seg[i]=seg[2*i+1]+seg[2*i+2];
    }
    
    public int sumRange(int left, int right) {
        
        return  sum(0,nums.length-1,left,right,0);
    }
    public int sum(int l,int r,int st,int en,int i){
        if(r<st || l>en){
            return 0;
        }

        if(st<=l && en>=r){
            return seg[i];
        }

        int mid=l+(r-l)/2;
        return sum(l,mid,st,en,2*i+1) + sum(mid+1,r,st,en,2*i+2);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */