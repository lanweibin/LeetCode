package array.easy;
//35. Search Insert Position
public class SearchPosition {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] > target){
                result =  0;
            }else if (nums[nums.length-1] <target){
                result =  nums.length;
            }else if (nums[i] == target){
                result = i;
            }else if (nums[i] <target && nums[i+1] > target){
                result = i+1;
            }

        }
        return result;
    }

    public static int searchInsert1(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,6};

        int n = searchInsert1(arr,2);

        System.out.println(n);
    }

}
