class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());


        }
        int []indegree=new int[V];

        for(int a[]:prerequisites){
            adj.get(a[1]).add(a[0]);
            indegree[a[0]]++;

        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0)
            q.add(i);
        }
        int ans[]=new int[V];
        int c=0;
        while(!q.isEmpty()){
            int a=q.poll();
            ans[c]=a;
            c++;
            for(int i:adj.get(a)){
                indegree[i]--;
                if(indegree[i] == 0) {
                    q.add(i);
                } 
            }
        }
        //System.out.println(c);

        return c==V ?  ans: new int[]{}; 
    }
}