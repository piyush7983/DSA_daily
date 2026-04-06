import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] arr={{0,1},{1,0},{0,-1},{-1,0}};
        Set<String> set=new HashSet<>();

        for(int[] obs:obstacles) set.add(obs[0]+","+obs[1]);
        int x=0;
        int y=0;
        int d=0;
        int max=0;

        for(int c:commands){
            if(c==-1)d=(d+1)%4;
            else if(c==-2)d=(d+3)%4;
            else{
                for(int i=0;i<c;i++){
                    int nx=x+arr[d][0],ny=y+arr[d][1];

                    if(set.contains(nx+","+ny))break;
                    
                    x=nx;y=ny;
                    max=Math.max(max,x*x+y*y);
                }
            }
        }
        return max;
    }
}