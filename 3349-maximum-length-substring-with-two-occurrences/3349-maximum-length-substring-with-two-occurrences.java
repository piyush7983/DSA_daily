class Solution {
    public int maximumLengthSubstring(String s) {
        int ar[]=new int[26];
        int max=0;
        int i=0;int j=0;
        while(i<s.length() && j<s.length()){
            
            ar[s.charAt(j)-'a']++;
           

            
            while(ar[s.charAt(j)-'a']>2){
                
                ar[s.charAt(i)-'a']--;
                i++;
                
            }
           
            j++;
            max=Math.max(j-i,max);
        }
        return max;
    }
}