class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean a=false;
        while(i<j)
        {
            if( s.charAt(i)!=s.charAt(j)){
                
                return (ispal(s,i,j-1) || ispal(s,i+1,j));
            }
            i++;
            j--;
        }

        return true;


            
        
    }

    public boolean ispal(String s,int i ,int j){
        

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }


            
            i++;
            j--;
            
        }
        return true;
        
        
    }
}