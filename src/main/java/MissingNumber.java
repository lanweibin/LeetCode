public class MissingNumber {
    /**
     *
     给定一个包含n个不同数字的数组0, 1, 2, ..., n，找到数组中缺少的数字。
     例如，
     Given nums = [0, 1, 3]return 2。
     */
    public static int missingNumber(int[] nums) {
        int a = 0 ,b = 0;
        for(int i = 0; i< nums.length; i++){
            a = a + nums[i];
        }
        for(int j = 0; j< nums.length+1; j++){
            b = b + j;
        }
        int result = b - a;

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,3};
        missingNumber(nums);
        System.out.print(missingNumber(nums));
    }


}
