class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=grid[i][0];
            for(int j=1;j<m;j++){
                a[i]+=grid[i][j];
            }
            sum+=a[i];
        }
        
       
        if(sum%2==0){
            int s2=0;
            for(int i=0;i<n;i++){
                s2+=a[i];
                if(s2==sum/2){
                    
                    return true;
                }
                
            }
        }
        sum=0;
        int b[]=new int[m];
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                b[j]+=grid[i][j];
            }
            sum+=b[j];
        }
        if(sum%2==0){
            int s2=0;
            for(int i=0;i<m;i++){
                s2+=a[i];
                if(s2==sum/2){
                    
                    return true;
                }
                
            }
        }

        return false;
    }
}