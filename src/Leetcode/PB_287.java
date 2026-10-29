package Leetcode;

import java.util.Arrays;

public class PB_287 {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        findDuplicate(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int findDuplicate(int[] nums) {
        int pointer = 0;
        while (pointer < nums.length) {
            int correctValue = nums[pointer] - 1;
            if (nums[pointer] != nums[correctValue]) {
                Swap(nums, pointer, correctValue);
            }else{
                pointer++;
            }
        }

        int answer = 0;

        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1) {
                answer = nums[index -1];
                break;
            }
        }

        return answer;
    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
