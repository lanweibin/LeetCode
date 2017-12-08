package array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//46. Permutations
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, new ArrayList<Integer>(), nums);

        return result;
    }

    private static void dfs(List<List<Integer>> result, ArrayList<Integer> templist, int[] nums) {
        if (templist.size() == nums.length){
            result.add(new ArrayList<>(templist));
        }else {
            for (int i = 0; i < nums.length; i++) { //每次dfs时候，i都是0
                if (templist.contains(nums[i])){
                    continue;
                }
                templist.add(nums[i]);
                dfs(result, templist, nums);
                templist.remove(templist.size() - 1);
            }
        }

    }


    public static void main(String[] args) {
        int[] num = {1,2,3};

        List<List<Integer>> result = permute(num);

        for (List in : result) {
            System.out.println(in);

        }
    }
}
