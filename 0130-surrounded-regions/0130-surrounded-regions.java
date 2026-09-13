class Solution {
    
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean vis[][]=new boolean[n][m];
   
        

        for(int i=0;i<m;i++){
           
            if(!vis[0][i] && board[0][i]=='O') dfs(0,i,vis,board,n,m);
        }
        for(int i=1;i<n;i++){
            if(!vis[i][m-1] && board[i][m-1]=='O') dfs(i,m-1,vis,board,n,m);
        }
        for(int i=1;i<m;i++){
            if(!vis[n-1][i] && board[n-1][i]=='O') dfs(n-1,i,vis,board,n,m);
        }
        for(int i=1;i<n;i++){
            if(!vis[i][0] && board[i][0]=='O') dfs(i,0,vis,board,n,m);
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(!vis[i][j]  ){
                    board[i][j]='X';
                }
            }
        }



        
    }
    public void dfs(int i,int j,boolean vis[][], char board[][],int n,int m){
        vis[i][j]=true;
        System.out.println(i+" "+j);
        int dr[]={1,0,-1,0};
        int dc[]={0,1,0,-1};

        for(int k=0;k<4;k++){
            int nr=i+dr[k];
            int nc=j+dc[k];
            if(nr>=0 && nc>=0 && nr<n && nc<m && !vis[nr][nc] && board[nr][nc]=='O'){
                dfs(nr,nc,vis,board,n,m);

            }
        }
    }
}