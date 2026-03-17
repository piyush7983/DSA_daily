class Solution {

    int par[];
    int rank[];
    int find(int a){
        if(par[a]==a){
            return a;
        }
        return par[a]= find(par[a]);
    }
    void union(int a,int b){

        int ap=find(a);
        int bp=find(b);

        if(ap==bp)return ;
        else if(rank[ap]>rank[bp]){
            par[bp]=ap;
        }
        else if(rank[ap]<rank[bp]){
            par[ap]=bp;
        }
        else {
            par[ap]=bp;
            rank[bp]++;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int m=isConnected[0].length;

        par=new int[n];
        rank=new int[n];

        for(int i=0;i<n;i++){
            par[i]=i;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i!=j) && isConnected[i][j]==1){
                    union(i,j);
                }
            }
        }

        int ans=0;
        for(int i=0;i<n;i++){
            if(par[i]==i){
                ans++;
            }
        }
        return ans;


    }
}