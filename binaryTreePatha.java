import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class binaryTreePatha {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path=new ArrayList<>();
        if(root==null){
            return path;
        }
        
        StringBuilder s=new StringBuilder();
        buildPaths(root,s,path);
        return path;
    }
    
    public void buildPaths(TreeNode root, StringBuilder s,List<String> path){
        if(root==null){
            return;
        }

        int orLen=s.length();
        if(orLen>0){
            s.append("->");
        }
        s.append(root.val);
        if(root.left==null && root.right==null){
            path.add(s.toString());
        }
        buildPaths(root.left,s,path);
        buildPaths(root.right,s,path);
        s.setLength(orLen);
    }
    

}
