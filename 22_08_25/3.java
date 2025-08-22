//Binary Tree to BST

/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root) {
        // Your code here
        ArrayList<Integer>ar=new ArrayList<>();
        helper(root,ar);
        Collections.sort(ar);
        helper2(root,ar);
        return root;
        
        
    }
    
    void helper(Node root,ArrayList<Integer>ar) {
        // Your code here
        if(root==null)return;
        ar.add(root.data);
        helper(root.left,ar);
        
        helper(root.right,ar);
        
        
    }
    int i=0;
    void helper2(Node root,ArrayList<Integer>ar) {
        // Your code here
        if(root==null)return;
        
        helper2(root.left,ar);
        
        root.data=ar.get(i);
        i++;
        helper2(root.right,ar);
        
        
        
        
    }
}