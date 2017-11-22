package array.easy;

import java.util.HashSet;

/**
 * 给定一个整数数组，查找数组是否包含任何重复项。
 * 如果任何值在数组中至少出现两次，则函数应该返回true，如果每个元素都不相同，则它应该返回false。
 */
public class ContainsDuplicate {
    public static  boolean contaionsDuplicate(int[] nums){
        if(nums.length == 1){
            return  false;
        }


        HashSet<Integer> hs = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
//
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }else {
                count++;
            }

        }

        if(count == 0){
            return false;
        }else {
            return  true;
        }

    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        boolean b =contaionsDuplicate(nums);
        System.out.println(b);
    }
}


//答案
//    public  boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i : nums)
//            if(!set.add(i))// if there is same
//                return true;
//        return false;
//    }