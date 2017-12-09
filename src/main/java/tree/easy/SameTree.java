package tree.easy;



//100. Same Tree
public class SameTree {
//    public boolean isSameTree(TreeNode p, TreeNode q){
//        StringBuilder sb = new StringBuilder();
//
//      String sp =  preOrder(p);
//      String sq =  preOrder(q);
//        if (sp.equals(sq)){
//            return true;
//        }else {
//            return false;
//        }
//
//    }


    public boolean isSameTree(TreeNode p, TreeNode q){
//        if (p ==null && q == null){
//            return true;
//        }
        if (p == null && q == null) {
            return true;
        }

        if ((p == null && q != null) || (p != null && q == null)){
            return false;
        }



        if (p.val != q.val) {//判断每个节点的值是否相等，如果去除此判断，则判断两个二叉树是否结构相等
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }

    public String preOrder(TreeNode t){
        if (t == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        if (t.left != null){
            preOrder(t.left);
        }
        if (t.right != null){
            preOrder(t.right);
        }
        return sb.toString();
    }


}
