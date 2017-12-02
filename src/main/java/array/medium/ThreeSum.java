package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15. 3Sum
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res =  new ArrayList<>();
        int len = nums.length;
        if (len < 3){
            return res;
        }

        Arrays.sort(nums);

        for (int i = 0; i < len ; i++) {
            if (nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]){
                continue;//两个数相等，不判断了
            }
            int begin = i+1, end = len - 1;
            while (begin < end){
                int sum = nums[i] + nums[begin] + nums[end];
                if (sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[begin]);
                    list.add(nums[end]);
                    res.add(list);
                    begin++;
                    end--;
                    while (begin < end && nums[begin] == nums[begin - 1]) begin++;
                    while (begin < end && nums[end] == nums[end + 1]) end--;

                }else if (sum > 0){
                    end--;
                }else {
                    begin++;
                }
            }


        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(arr);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));

        }
    }

}
