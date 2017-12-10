package bfs.easy;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevel {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new LinkedList<>();

        bfs(result,root, 0);

        return result;
    }

    private void bfs(List<List<Integer>> result, TreeNode root,  int level) {
        if (root == null) return;
        if (level >= result.size()){
            result.add(new LinkedList<>());
        }

        result.get(level).add(root.val);
        bfs(result, root.left, level+1);
        bfs(result, root.right, level+1);
    }
}
