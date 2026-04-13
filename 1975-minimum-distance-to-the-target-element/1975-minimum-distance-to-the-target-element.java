class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i=start;
        int j=start;

        while(i>=0 || j<nums.length){
            
            if(nums[i]==target){
                return Math.abs(start-i);
            }
            else if(nums[j]==target){
                return Math.abs(start-j);
            }
            if(i>0){
                i--;

            }
            if(j<nums.length-1){
                j++;
            }

        }return -1;
    }
}