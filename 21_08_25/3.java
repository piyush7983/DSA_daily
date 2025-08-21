// kth-smallest-element-in-a-bst/


class Solution {
    int i=0,ans=-1;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;
    }
    public void helper(TreeNode root, int k){
        if(root==null){
            return;
        }
        helper(root.left,k);
        i++;
        if(i==k){
            ans=root.val;
        }
        helper(root.right,k);
    }