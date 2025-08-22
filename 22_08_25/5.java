//Brothers From Different Roots

/*Structure of the Node of the BST is as
class Node
{
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    
    public static int countPairs(Node root1, Node root2, int x) {
        // Code here
        HashSet<Integer> hs = new HashSet<>();
        helper(hs,root1);
        return helper2(hs,x,root2);
        
        
    }
    public static void helper(HashSet<Integer> hs,Node r1){
        if(r1==null){
            return;        
            
        }
        helper(hs,r1.left);
        hs.add(r1.data);
        helper(hs,r1.right);
        
    }
    


    public static int helper2(HashSet<Integer> hs,int x,Node r2){
        if(r2 == null) return 0;
        
        int count = 0;
        if(hs.contains(x - r2.data)) count++;
        
        count += helper2(hs, x, r2.left);
        count += helper2(hs, x, r2.right);
        return count;
    }
}