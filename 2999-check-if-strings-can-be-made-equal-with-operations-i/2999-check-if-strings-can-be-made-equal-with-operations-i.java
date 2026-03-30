class Solution {
    public boolean canBeEqual(String s1, String s2) {
        HashSet<Character> a=new HashSet<>();
        HashSet<Character> b=new HashSet<>();

        for(int i=0;i<4;i++){
            if(i%2==0){
                a.add(s2.charAt(i));
            }
            else{
                b.add(s2.charAt(i));
            }
        }

        for(int i=0;i<4;i++){
            if(i%2==0){
                if(!a.contains(s1.charAt(i))){
                    return false;
                }
            }
            else{
                if(!b.contains(s1.charAt(i))){
                    return false;
                }
                
            }
        }

        return true;


    }
}