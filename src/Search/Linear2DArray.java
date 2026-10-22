package Search;

import java.util.Arrays;

public class Linear2DArray{
    public static void main(String[] args) {
        int[][] array2D = {
            {12, 34, 65, 80, 90},
            {66, 89, 76, 22, 16},
            {5, 707, 67, 69, 100}
        };

        int min = minimum(array2D);

        int max = maximum(array2D);

        int[] ans = LinearSearch(array2D, 22);

        System.out.println("Targeted Element was found here !");
        System.out.println(Arrays.toString(ans));

        System.out.println("Here I find the Minimum Value in the 2D Array");
        System.out.println(min);

        System.out.println("Here I Find the Maximum");
        System.out.println(max);
    }

    static int[] LinearSearch(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }

    static int minimum(int[][] arr){
        int min = Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }

        return min;
    }

    static int maximum(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        return max;
    }
}