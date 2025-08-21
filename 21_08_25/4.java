//Merge 2 bst

class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order
    ArrayList<Integer>l=new ArrayList<>();
    public void fun(Node root){
        if(root==null){
            return;
        }
        l.add(root.data);
        fun(root.left);
        
        fun(root.right);
    }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // Write your code here
        fun(root1);
        fun(root2);
        Collections.sort(l);
        return l;
    }
}