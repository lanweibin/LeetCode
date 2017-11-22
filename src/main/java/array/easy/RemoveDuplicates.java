package array.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个有序数组，删除重复内容，使每个元素只出现一次，并返回新的长度。
 * 给定nums = [1,1,2]，
 *你的函数应该返回length = 2，num的前两个元素分别是1和2。
 */

public  class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if (list.contains(nums[i]) == false){
                list.add(nums[i]);
            }
        }

        for (int j =0; j<list.size(); j++){
            nums[j] = list.get(j);
        }

        return  list.size();

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};

        int n = removeDuplicates(nums);

        System.out.println(n);
    }
}
