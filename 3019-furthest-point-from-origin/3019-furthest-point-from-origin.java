class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int d=0,w=0;
        for(char c:moves.toCharArray()){
            
            if(c=='L')d--;
            else if(c=='R')d++;
            else w++;
        }
        return Math.abs(d)+w;
    }
}