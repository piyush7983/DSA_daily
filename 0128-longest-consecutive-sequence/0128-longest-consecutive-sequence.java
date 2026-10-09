class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>() ;

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);

        }
        int max=0;
        for(int num:hs){
            int c=1;
            int e=num;
           if(!hs.contains(e-1)){
                while(hs.contains(e+1)){
                    
                    e=e+1;
                    c++;
                }
           }
            max=Math.max(max,c);
        }
        return max;
    }
}