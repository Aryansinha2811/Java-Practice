package Leetcode;

// https://leetcode.com/problems/move-zeroes/description/

public class PB_283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length -1; j++) {
                if (nums[j] < nums[j-1] || nums[j] == 0) {
                    Swap(nums, j, j-1);
                }
            }
        }
    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
