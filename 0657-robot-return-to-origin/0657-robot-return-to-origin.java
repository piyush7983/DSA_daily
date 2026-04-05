class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;
        int j=0;

        for(int a=0;a<moves.length();a++){
            char c=moves.charAt(a);

            if(c=='U'){
                i--;
            }
            if(c=='D'){
                i++;
            }
            if(c=='L'){
                j--;
            }
            if(c=='R'){
                j++;
            }
        }

        if(i==0 &&  j==0){
            return true;
        }
        return false;
    }
}