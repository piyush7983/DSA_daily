class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();

        help(n,ans,"(",1,0);
        return ans;
    }

    public void help(int n,List<String> ans,String a,int o,int c){
        if(o>n || c>o){
            return ;
        }
        if(a.length()==2*n){
            ans.add(a);
            return;
        }

        help(n,ans,a+"(",o+1,c);
        help(n,ans,a+")",o,c+1);
    }
}