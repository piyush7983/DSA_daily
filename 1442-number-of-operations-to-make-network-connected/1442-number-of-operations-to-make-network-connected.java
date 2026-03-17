class Solution {
    public int makeConnected(int n, int[][] connections) {
        //int n=connections.size();
      if (connections.length<n-1) return -1;

        par=new int[n];
        rank=new int[n];

        for(int i=0;i<n;i++){
            par[i]=i;
        }

        for(int i[]:connections){
            
                union(i[0],i[1]);
                
            
        }

        int ans=0;
        for(int i=0;i<n;i++){
            if(par[i]==i){
                ans++;
            }
        }
        
        return ans-1;
        


    }



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
    
        
    
}