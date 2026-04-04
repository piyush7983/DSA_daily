class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        StringBuilder ans = new StringBuilder();
        int i=0,j=0;
        int c=encodedText.length()/rows;
        int n=encodedText.length();
        int co=0;
        while(j<n){
            if(j==c && i==0){
                break;
            }
            ans.append(encodedText.charAt(j));

            j=j+1+c;
            i++;
            
            if(i==rows){
                co++;
                j=co;
                i=0;;
            }
            
        }
        int a=0;
        int b=0;

        
        for(int k=ans.length()-1;k>=0;k--){
            if(!(ans.charAt(k)==' ')){
                break;
            }
            b++;
        }
        //return ans;
       return ans.substring(0,ans.length()-b);
    }
}