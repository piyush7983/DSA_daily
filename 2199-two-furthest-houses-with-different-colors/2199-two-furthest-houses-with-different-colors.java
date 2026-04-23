class Solution {
    public int maxDistance(int[] c) {
        int n=c.length,res=0;
        for(int i=n-1;i>0;i--){
            if(c[i]!=c[0]){
                res=Math.max(res,i);
                break;
            }
        }
        for(int i=0;i<n-1;i++){
            if(c[i]!=c[n-1]){
                res=Math.max(res,n-1-i);
                break;
            }
        }
        return res;
    }
}