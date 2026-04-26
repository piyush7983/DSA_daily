class Solution {
    public boolean containsCycle(char[][] g) {
        int m=g.length,n=g[0].length;
        boolean[][] v=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(!v[i][j] && dfs(g,v,i,j,-1,-1,g[i][j]))
                    return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] g,boolean[][] v,int r,int c,int pr,int pc,char k){
        v[r][c]=true;
        int[] d={0,1,0,-1,0};
        for(int i=0;i<4;i++){
            int nr=r+d[i],nc=c+d[i+1];
            if(nr>=0 && nr<g.length&&nc>=0 && nc<g[0].length && g[nr][nc]==k){
                
                if(v[nr][nc] && (nr!=pr||nc!=pc))return true;
                if(!v[nr][nc] && dfs(g,v,nr,nc,r,c,k))return true;
            }
        }
        return false;
    }
}