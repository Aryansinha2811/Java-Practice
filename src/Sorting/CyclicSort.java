package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = {4,2,1,5,3};

        cyclicSort(array);

        System.out.println(Arrays.toString(array));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                Swap(arr, i, correct);
            }else{
                i++;
            }
        }

    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
