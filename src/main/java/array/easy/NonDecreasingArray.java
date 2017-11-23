package array.easy;

//665. Non-decreasing Array

public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            if(i<nums.length-1) {
                if (nums[i] < nums[i + 1]) {
                    return true;
                }
            }


        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3};
        boolean b = checkPossibility(arr);

        System.out.println(b);
    }

}
