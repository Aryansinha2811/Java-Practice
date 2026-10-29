package Leetcode;

// https://leetcode.com/problems/set-mismatch/

public class PB_645 {
    public int[] findErrorNums(int[] nums) {
        int pointer = 0 ;
        while (pointer < nums.length) {
            int correct = nums[pointer] - 1;
            if (nums[pointer] != nums[correct]) {
                Swap(nums, pointer, correct);
            }
            else{
                pointer++;
            }
        }

        int ans = 0;
        int sameAns = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans = nums[i];
                sameAns = i + 1;
                break;
            }
        ;
        }

        return new int[]{ans , sameAns};

    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
