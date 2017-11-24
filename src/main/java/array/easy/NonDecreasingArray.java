package array.easy;

//665. Non-decreasing Array

public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {

        boolean b = false;
        for (int i = 0; i <= nums.length; i++) {

            if (i+1<nums.length && nums[i] > nums[i+1]){
                if (b){
                    return false;
                }else {
                    if (i-1 < 0 || nums[i+1] >= nums[i-1]){
                        nums[i] = nums[i+1];
                    }else {
                        nums[i+1] = nums[i];
                    }

                    b = true ;
                }
            }
        }

        return true ;
    }

    public static boolean checkPossibility2(int[] nums){
        int count = 0;

        for (int i = 0; i+1 < nums.length; i++) {
            if (nums[i] > nums[i+1]){
                count ++;
                if(i>0 && nums[i+1] < nums [i-1]){
                    nums[i+1] = nums[i];
                }else {
                    nums[i] = nums [i+1];
                }
            }


        }
        return count<=1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3};
        boolean b = checkPossibility2(arr);

        System.out.println(b);
    }

}
