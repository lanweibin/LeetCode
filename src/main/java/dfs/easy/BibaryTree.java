package dfs.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//257. Binary Tree Paths
public class BibaryTree {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null){
            return result;
        }
        dfs(result, root, "");
        return result;
    }

    private void dfs(List<String> result, TreeNode root, String path ) {
       if (root.left == null && root.right == null){
           result.add(path + root.val);
       }

       if (root.left != null){
           dfs(result, root.left, path + root.val + "->");
       }

        if (root.right != null){
            dfs(result, root.right, path + root.val + "->");
        }

    }
}
