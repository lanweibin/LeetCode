package array.medium;

import java.util.ArrayList;
import java.util.List;

//78. Subsets
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(res, temp, nums, 0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
        res.add(new ArrayList<Integer>(temp));

        for (int i = j; i < nums.length; i++){
            temp.add(nums[i]);
             dfs(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {2,1,3};
        List<List<Integer>> res = subsets(nums);

//        for (int i = 0; i < res.size(); i++) {
//            System.out.println(res.get(i));
//
//        }

        for (List re : res){
            System.out.println(re);
        }
    }
}
