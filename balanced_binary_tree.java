public class balanced_binary_tree {
 

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Height(root)==-1) return false;
        return true;
    }

    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=Height(root.left);
        int rightHeight=Height(root.right);
        if(leftHeight==-1 || rightHeight==-1) return -1;
        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }

}
