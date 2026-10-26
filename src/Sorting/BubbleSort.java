package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,1};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void bubbleSort(int[] arr){

        boolean swapped = false;

        for(int i=0; i< arr.length;i++){
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) { // If we did the > sign then it will sort in descending order
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}
