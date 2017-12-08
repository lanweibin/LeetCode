package bfs.easy;

//101  Symmetric Tree
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }

        return isSame(root.left, root.right);

    }

    private boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val ) return false;

        return isSame(p.left, q.right) && isSame(p.right, q.left);

    }


}
