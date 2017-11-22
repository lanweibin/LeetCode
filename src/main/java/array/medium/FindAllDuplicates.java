package array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//442. Find All Duplicates in an Array


public class FindAllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();


        int[] count = new int[nums.length+1] ;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]] = count[nums[i]] +1 ;
        }

        for (int j = 0; j < count.length; j++) {
            if(count[j] == 2){
                list.add(j);
            }

        }
        return list;
    }



    public static void main(String[] args) {
       int[] nums = {4,3,2,7,8,2,3,1};

       List<Integer> list = findDuplicates(nums);


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
    }
}
