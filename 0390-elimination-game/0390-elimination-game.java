 class Solution {
    public int lastRemaining(int n) {
        int h = 1;
        int step = 1;
        int r = n;
        boolean bb = true;

        while(r>1) {
           
            if(bb || r%2==1) {
                h = h+step;
            }

            
            step*= 2;
            
            r/= 2;
           
            bb= !bb;
        }

        return h;
    }
}