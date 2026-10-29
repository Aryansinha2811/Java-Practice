package Leetcode;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PB_442 {

    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};

        findDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {
        int pointer = 0;
        while (pointer < nums.length) {
            int correct = nums[pointer] - 1;
            if (nums[pointer] != nums[correct]) {
                Swap(nums, pointer, correct);
            }
            else{
                pointer++;
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                answer.add(nums[index]);
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
