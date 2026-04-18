class Solution {
    public int mirrorDistance(int n) {
        String s=Integer.toString(n);
        StringBuilder str=new StringBuilder(s);
        
        return Math.abs(n-Integer.parseInt(str.reverse().toString()));
    }
}