class Solution {
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length][2][3];
        for (int i=0;i<prices.length;i++){
            for(int j=0;j<dp[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return help(0,prices,prices.length,1,0,dp);            
    }
    public int help(int i,int []prices,int n,int buy,int t,int dp[][][]){
        if(i>=n || t>2){
            return 0;
        }
        if(dp[i][buy][t]!=-1){
             return dp[i][buy][t];
         }
        int a=0;
        //buy karliya hai to ab bache subproblem ko sell karunga
        if(buy==1){
            int b=help(i+1,prices,n,0,t+1,dp)-prices[i];
            int ntbuy=help(i+1,prices,n,1,t,dp);
            
            a=Math.max(b,ntbuy);
        }
        else{
            int sell=prices[i] + help(i+1,prices,n,1,t,dp);
            int notsell=help(i+1,prices,n,0,t,dp);

            a=Math.max(sell,notsell);
        }

        return dp[i][buy][t]=a;


    }
}