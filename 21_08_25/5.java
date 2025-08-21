// two-sum-iv-input-is-a-bst


class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>hs=new HashSet<>();
        
        return helper(root,k,hs);
        
    }
    public boolean helper(TreeNode root, int k,HashSet<Integer>hs) {
        if(root==null){
            return false;
        }
        
        if(hs.contains(k-root.val)){
            return true;
        }
 
        hs.add(root.val);
        return helper(root.left,k,hs) || helper(root.right,k,hs);
    }


}