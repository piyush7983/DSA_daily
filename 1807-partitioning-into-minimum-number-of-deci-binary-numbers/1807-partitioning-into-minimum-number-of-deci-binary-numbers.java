class Solution {
    public int minPartitions(String n) {
        int max=0;

      
        for(int i=0;i<n.length();i++){
            int rem=Integer.parseInt(String.valueOf(n.charAt(i)));
            max=Math.max(rem,max);
            
        }
        return max;
    }
}