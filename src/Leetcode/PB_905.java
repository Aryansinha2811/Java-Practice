package Leetcode;

// https://leetcode.com/problems/sort-array-by-parity/

public class PB_905 {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length -1; j++) {
                // This If Condition checks all and helps in shifting 
                if (nums[j] % 2 != 0 && nums[j+1] % 2 == 0) {
                    Swap(nums, j, j+1);
                }
            }
        }
        return nums;
    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
