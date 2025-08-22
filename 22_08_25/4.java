//Find Common Nodes in two BSTs

class Solution {
    // Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        ArrayList<Integer>ar=new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        
        helper(hs,r1);
        helper2(hs,ar,r2);
        return ar;
        
        
    }
    
    
    
    
    
    
    public static void helper(HashSet<Integer> hs,Node r1){
        if(r1==null){
            return;        
            
        }
        helper(hs,r1.left);
        hs.add(r1.data);
        helper(hs,r1.right);
        
    }
    
    
    
    public static void helper2(HashSet<Integer> hs,ArrayList<Integer>ar,Node r2){
        if(r2==null){
            return ;        
            
        }
        
        helper2(hs,ar,r2.left);
        if(hs.contains(r2.data)){
            ar.add(r2.data);
        }
    
        helper2(hs,ar,r2.right);
        
    }
}