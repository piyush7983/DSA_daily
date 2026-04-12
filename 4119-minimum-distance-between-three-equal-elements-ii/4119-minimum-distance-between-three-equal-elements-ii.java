class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        
        HashMap<Integer,ArrayList<Integer>> hm =new HashMap<>();

        for(int i=0;i<n;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],new ArrayList<>());
            }
            ArrayList<Integer> a=hm.get(nums[i]);
            a.add(i);
            int s=a.size();
            if(s>=3){
               

                int r=2*(i-a.get(s-3));

                min=Math.min(min,r);
            }
        }

        return min==Integer.MAX_VALUE ? -1: min; 
    }
}