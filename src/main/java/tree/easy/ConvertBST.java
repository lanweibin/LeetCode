package tree.easy;

import java.util.ArrayList;
import java.util.List;

//538. Convert BST to Greater Tree
public class ConvertBST {
    public TreeNode convertBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int[] sum = new int[list.size()];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < list.size(); j++) {
               sum[i] += list.get(j);

            }

        }
        sum[list.size() -1] = 0;

        preOrder(root, sum);
        return root;



    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root ==null)return ;

        if (root.left != null){
            inOrder(root.left, list);
        }
        list.add(root.val);
        if (root.right != null){
            inOrder(root.right, list);
        }
    }

    private void preOrder(TreeNode root, int[] num) {
        if (root ==null)return ;
        int n = 0;
        root.val += num[n++];

        if (root.left != null){
            preOrder(root.left, num);
        }

        if (root.right != null){
            preOrder(root.right, num);
        }
    }
}
