package Leetcode;

public class PB_268 {

    // Used Cyclic Sort to solve this problem
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                Swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        return nums.length;
    }
    public  void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
}

