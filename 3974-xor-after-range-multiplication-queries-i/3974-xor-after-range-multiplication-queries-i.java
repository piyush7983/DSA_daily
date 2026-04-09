class Solution {
    static long mod=(long)1000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        
        for(int a[]:queries){
            int l=a[0];
            int r=a[1];
            int k=a[2];
            int v=a[3];
            
            while(l<=r){

                long aaaaa = nums[l];
                aaaaa = (aaaaa* v) %mod;
                nums[l]=(int)aaaaa;
                l+=k;
                
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}