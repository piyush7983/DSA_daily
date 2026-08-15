class Solution {
    public int longestSubsequence(int[] nums) {
        int ans=0;

        int c=0;

        for(int i=0;i<nums.length;i++) {
            ans^=nums[i];

            if(nums[i]==0) c++;
        }

        if(ans!=0){
             return nums.length;
        }

        return c==nums.length ? 0: nums.length-1 ;
    }
}