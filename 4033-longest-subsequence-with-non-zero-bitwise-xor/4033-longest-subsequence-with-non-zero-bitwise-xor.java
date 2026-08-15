class Solution {
    public int longestSubsequence(int[] nums) {
        int ans=0;

        boolean b=false;

        for(int i=0;i<nums.length;i++) {
            ans^=nums[i];

            if(nums[i]!=0) b = true;
        }

        if(ans!=0){
             return nums.length;
        }

        return b? nums.length-1 : 0;
    }
}