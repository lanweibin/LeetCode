package tree.easy;

import com.sun.org.apache.regexp.internal.RE;

//226. Invert Binary Tree
public class InvertTree {
    public TreeNode invertTree(TreeNode root){
        if ( root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
