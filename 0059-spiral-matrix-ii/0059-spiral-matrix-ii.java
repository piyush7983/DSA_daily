class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int v=1,r1=0,r2=n-1,c1=0,c2=n-1;
        while(v<=n*n){

            for(int i=c1;i<=c2;i++){ 
                res[r1][i]=v++;
            }
            r1++;
            
            for(int i=r1;i<=r2;i++){
                 res[i][c2]=v++;
            }
                
            c2--;
            
            for(int i=c2;i>=c1;i--){ 
                res[r2][i]=v++;
            }
            r2--;
            
            for(int i=r2;i>=r1;i--){
                res[i][c1]=v++;
            }
            c1++;
            
        }
        return res;
    }
}