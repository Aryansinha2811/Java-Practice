package Search;

import java.util.Arrays;

public class Binary2DArray {
    public static void main(String[] args) {
        
        int[][] array = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {21, 31, 41, 51}
        };

        System.out.println("Binary Search on 2D Array");
        System.out.println(Arrays.toString(binarySearch(array, 30)));
    }

    static int[] binarySearch(int[][] array, int target){

        int row = 0;
        int col = array.length - 1;

        while (row < array.length && col >= 0) {
            if (array[row][col] == target) {
                return new int[]{row, col};
            }else if (array[row][col] < target) {
                row++;
            }else{
                col--;
            }
        }

        return new int[]{-1, -1};
    }
}
