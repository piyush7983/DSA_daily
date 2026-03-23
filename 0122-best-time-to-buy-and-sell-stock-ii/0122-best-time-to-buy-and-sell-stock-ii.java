class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int ans=0;
        int sell=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<=prices[i]){
                sell=i;
            }
            else{
                ans+=prices[sell]-prices[buy];
                buy=i;
                sell=i;
            }
        }
        ans+=prices[sell]-prices[buy];
        return ans;
    }
}