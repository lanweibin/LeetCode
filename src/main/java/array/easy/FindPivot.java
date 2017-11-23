package array.easy;

//724. Find Pivot Index
public class FindPivot {
    public static int  pivotIndex(int[] nums) {
        int sumleft = 0;
        int sumright = 0;
        int index = 0;

        for ( index = 0; index <= nums.length-1; index++) {
            for (int i = 0; i < index; i++) {
                sumleft += nums[i];

            }

            for (int j = nums.length-1; j >index; j--) {
                sumright += nums[j];

            }
            if (sumleft == sumright){
                return index;
            }

            sumleft = 0;
            sumright = 0;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        int result = pivotIndex(nums);

        System.out.println(result);
    }
}
