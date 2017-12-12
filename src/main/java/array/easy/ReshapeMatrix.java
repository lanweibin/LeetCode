package array.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//566. Reshape the Matrix
public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] nums, int r, int c){
        if (r * c > nums.length * nums[0].length){
            return nums;
        }


        int[][] re = new int[r][c];
        List<Integer> list =  new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
               list.add(nums[i][j]);

            }

        }

        int n = 0;
        for (int i = 0; i < re.length; i++) {
            for (int j = 0; j < re[0].length; j++) {

                re[i][j] = list.get(2);

            }

        }

        return re;

    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4}};
        int[][] re = matrixReshape(nums, 1, 4);

        for (int i = 0; i < re.length; i++) {
            for (int j = 0; j < re[i].length; j++) {
                System.out.print(re[i][j] + " ");

            }
            System.out.println();

        }
    }
}
