package array.medium;

import java.util.ArrayList;
import java.util.List;

//39. Combination Sum
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (candidates == null || candidates.length == 0) return result;

        dfs(result, list, candidates, target ,0);

        return result;
    }

    private static void dfs(List<List<Integer>> result, List<Integer> item, int[] candidates, int target, int j) {

        if (target < 0)return;
        if (target == 0){

            result.add(new ArrayList<Integer>(item));
            return ;


        }

        for (int i = j; i < candidates.length; i++) {
            item.add(candidates[i]);
            dfs(result, item, candidates,target - candidates[i], i);
            item.remove(item.size() - 1);
        }

//        for (int i = j; i < candidates.length; i++) {
//            //         //加上下面这句对结果没有影响，但会减少很多次循环，因为同一个数字可以复用（每次从i开始），所以重复数字就没有意义了
//            if(i>0 && candidates[i] == candidates[i-1]) continue;
//            list.add(candidates[i]);
//            dfs(result,list, candidates, target - candidates[i], i);
//            list.remove(list.size() - 1);
//        }
    }


    public static void main(String[] args) {
        int[] arr = {2,3,6,7};

        List<List<Integer>> re = combinationSum(arr, 7);

        for (List list : re){
            System.out.println(list);
        }
    }
}
