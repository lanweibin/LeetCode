package array.easy;

import java.util.ArrayList;
import java.util.List;

//448. Find All Numbers Disappeared in an Array
public class NumbersDisappeared {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counts = new int[nums.length];
        List list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]-1] = counts[nums[i]-1] +1;

        }
        for (int i = 0; i < counts.length; i++) {
           if (counts[i] == 0){
               list.add(i+1);
           }

        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        List list = findDisappearedNumbers(arr);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");

        }
    }
}
