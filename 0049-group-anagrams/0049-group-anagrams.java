class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){

            char c[]=s.toCharArray();
            Arrays.sort(c);
            String ss=Arrays.toString(c);
            if(!hm.containsKey(ss)){
                hm.put(ss,new ArrayList<>());
            }
            hm.get(ss).add(s);
            
            
            
        }
        List<List<String>> l=new ArrayList<>(hm.values());
        
       return l;
    }
}