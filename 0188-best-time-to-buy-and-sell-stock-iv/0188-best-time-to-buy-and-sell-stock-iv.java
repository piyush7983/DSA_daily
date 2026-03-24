class Solution {
    public int maxProfit(int k,int[] prices) {
        int dp[][][]=new int[prices.length][2][k+1];
        for (int i=0;i<prices.length;i++){
            for(int j=0;j<dp[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return help(0,prices,prices.length,1,0,k,dp);            
    }


    public int help(int i,int []prices,int n,int buy,int t,int k,int dp[][][]){
        if(i>=n || t>k){
            return 0;
        }
        if(dp[i][buy][t]!=-1){
             return dp[i][buy][t];
         }
        int a=0;
        
        if(buy==1){
            int b=help(i+1,prices,n,0,t+1,k,dp)-prices[i];
            int ntbuy=help(i+1,prices,n,1,t,k,dp);
            
            a=Math.max(b,ntbuy);
        }
        else{
            int sell=prices[i] + help(i+1,prices,n,1,t,k,dp);
            int notsell=help(i+1,prices,n,0,t,k,dp);

            a=Math.max(sell,notsell);
        }

        return dp[i][buy][t]=a;


    }
}