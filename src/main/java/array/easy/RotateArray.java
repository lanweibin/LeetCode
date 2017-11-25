package array.easy;

//189. Rotate Array
public class RotateArray {
    public void rotate(int[] nums, int k) {
       while (k-- >0){
           int temp = nums[nums.length-1];
           for (int i = nums.length-1; i > 0; i--) {
               nums[i] = nums[i-1];

           }
           nums[0] = temp;
       }
    }

    public static void rotate2(int[] nums, int k){
        int n = nums.length;

        helper(nums,0,k-1);
        helper(nums,k,n-1);
        helper(nums,0,n-1);
    }

    public static void helper(int[] nums, int star, int end){
        for (int i = star; i < (star+end)/2; i++) {
            int temp = nums[end+star-i];
            nums[end+star-i] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate2(nums,3);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");

        }
    }
}
