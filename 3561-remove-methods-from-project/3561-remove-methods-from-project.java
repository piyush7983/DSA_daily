class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj2=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            adj2.add(new ArrayList<>());
            ans.add(i);
        }
       

        int []in=new int[n];
        for(int i=0;i<invocations.length;i++){
            adj.get(invocations[i][0]).add(invocations[i][1]);
            adj2.get(invocations[i][1]).add(invocations[i][0]);
            in[invocations[i][1]]++;
            

        }
        HashSet<Integer> a =new HashSet<>();
        boolean vis[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(k);
        a.add(k);
        
        vis[k]=true;
        while(!q.isEmpty()){
            for(int i : adj.get(q.poll())){
                if(!vis[i]){
                    a.add(i);
                    q.add(i);
                    vis[i]=true;
                }
            }

        }
        
       boolean tr= false;
        for(int e:a){
            for(int i :adj2.get(e)){
                if(!a.contains(i)){
                    tr=true;
                    break;
                }
            }
        }
         ArrayList<Integer> al =new ArrayList<>();
        if(tr==true) return ans;
        else{
            int ar[]=new int [n];
            for(int i=0;i<n;i++){
                ar[i]=i;
            }
            int c=0;
            for(int e:a){
                ar[e]=-1;
                
            }

           
            for(int i=0;i<n;i++){
                if(ar[i]!= -1){
                    al.add(i);
                }
            }

        }
        return al;

        
        


    }
}