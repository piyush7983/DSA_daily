class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]=new int[50001][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,n,fee,prices,1,dp);
    }
    //buy ->1
    //sell->0

    public int helper(int i,int n,int fee,int prices[],int buy,int dp[][]){
        if(i>=n){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        int profit=0;
        if(buy==1){

            int b= -prices[i] + helper(i+1,n,fee,prices,0,dp);

            int nb= helper(i+1,n,fee,prices,1,dp);
            profit =Math.max(b,nb);
        }

        else{

            int sell = prices[i]-fee+helper(i+1,n,fee,prices,1,dp);
            int notsell=helper(i+1,n,fee,prices,0,dp);

            profit=Math.max(sell,notsell);

        }

        dp[i][buy]=profit;
        return dp[i][buy];

    }
}