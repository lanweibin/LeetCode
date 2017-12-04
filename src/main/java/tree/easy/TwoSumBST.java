package tree.easy;

import java.util.ArrayList;
import java.util.List;

///653. Two Sum IV - Input is a BST
public class TwoSumBST {
    public boolean findTarget(TreeNode root, int k){
        if (root == null){
            return false;
        }
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int i = 0, j = list.size() - 1;
        while (i < j){
            int sum = list.get(i) + list.get(j);
            if (sum == k){
                return true;
            }else if (sum < k){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null){
            return;
        }

        if (root.left!=null){
            inOrder(root.left, list);
        }
        list.add(root.val);

        if (root.right != null){
            inOrder(root.right, list);
        }
    }
}
