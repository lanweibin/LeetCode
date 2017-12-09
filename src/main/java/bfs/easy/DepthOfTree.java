package bfs.easy;

//111. Minimum Depth of Binary Tree
public class DepthOfTree {
    public int minDepth(TreeNode root){
        if (root == null) return 0;

        if (root.left  == null && root.right == null){
            return 1;
        }else if (root.left != null && root.right == null){
            return minDepth(root.left) + 1;
        }else if (root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        }else return Math.min(minDepth(root.left), minDepth(root.right)) +1;

    }
}
