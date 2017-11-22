package array.easy;

/**
 * 88. Merge Sorted Array
 */
public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1;
        int b = n-1;
        int len = m+n-1;



        while (a>=0 && b>=0){
            nums1[len--] = nums1[a]>nums2[b] ? nums1[a--] :nums2[b--];
        }
        while (a>=0){
            nums1[len--] = nums1[a--];
        }
        while (b>=0){
            nums1[len--] = nums2[b--];
        }
    }
}
