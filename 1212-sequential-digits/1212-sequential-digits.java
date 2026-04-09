class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> l=new ArrayList<>();
        
        String ans="123456789";

       // int p=1;
        for(int j=2;j<=ans.length();j++){
            for(int i=0;i<=ans.length()-j;i++){
                int a=Integer.parseInt(ans.substring(i,i+j));
                if(a>=low && a<=high){
                    l.add(a);
                }
                
            }
        }
        

        
       

        
        

        
        return l;

        

    }
}