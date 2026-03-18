class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int c=0;
        int n=grid.length;
        int m=grid[0].length;

        if(grid[0][0]<=k) c++;
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                grid[i][j]+=grid[i][j-1];
                if((i==0) && grid[i][j]<=k){
                    c++;
                }
            }
        }
        System.out.print(c);

        for(int j=0;j<m;j++){
            for(int i=1;i<n;i++ ){
                grid[i][j]+=grid[i-1][j];
                if( grid[i][j]<=k){
                    c++;
                }
            }
        }
        return c;
    }
}