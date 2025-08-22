/*
Count BST nodes that lie in a given range
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    int getCount(Node root, int l, int h) {
        // Your code here
        ArrayList<Integer> ar = new ArrayList<>();
        helper(root,ar);
        int c=0;
        for(int i=0;i<ar.size();i++){
            if(ar.get(i)>=l && ar.get(i)<=h ){
                c++;
            }
        }
        return c;
    }
    
    void helper(Node root,ArrayList<Integer>ar){
        if(root==null){
            return;
        }
        
        helper(root.left,ar);
        ar.add(root.data);
        helper(root.right,ar);
    }
}        for(int i=0;i<ar.size(;i++){

