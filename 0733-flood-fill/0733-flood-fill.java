class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int vis[][]=new int[n][m];

        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        int st=image[sr][sc];
        image[sr][sc]= color;

        vis[sr][sc]=1;
        while(!q.isEmpty()){
            int a[]=q.poll();

            int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};

            for(int i=0;i<dir.length;i++){
                int nr=a[0]+dir[i][0];
                int nc=a[1]+dir[i][1];
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && image[nr][nc] ==st){
                    image[nr][nc]=color;
                    q.add(new int[]{nr,nc});
                    vis[nr][nc]=1;
                }
            }

        }
        return image;
    }
}