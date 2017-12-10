package bfs.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//107. Binary Tree Level Order Traversal II
public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new LinkedList<>();

        bfs(result, root, 0 );

        return result;
    }

    private void bfs(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null)  return;
        if (level >= result.size()){
            result.add(0,new LinkedList<Integer>());
        }
        bfs(result, root.left, level + 1);
        bfs(result, root.right, level + 1);
        result.get(result.size() - level - 1).add(root.val);

    }


}
