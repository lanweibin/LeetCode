package array;

import java.util.LinkedList;
import java.util.List;

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
