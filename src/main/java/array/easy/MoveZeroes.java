package array.easy;

/**
 * 给定一个数组nums，写一个函数将所有0的移动到它的末尾，同时保持非零元素的相对顺序。
 * 例如，nums = [0, 1, 0, 3, 12]在给你的函数调用之后，nums应该是[1, 3, 12, 0, 0]。
 */

public class MoveZeroes {
    public static void moveZeroes(int[] nums){

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count = count +1;
            }
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }



        while (--count != -1){
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
           System.out.println(nums[i]);

        }

    }
}
