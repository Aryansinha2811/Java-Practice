package Leetcode;

// This Approach is Good But the Time Limit Exceeds , We will have to use Hashmap or HashSet to solve it in a Better way !

// I will Return after learning [Doomsday] !

// https://leetcode.com/problems/contains-duplicate/

public class PB_217 {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;

        for(int i=0; i< nums.length;i++){
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1]) { 
                    Swap(nums, j, j-1);
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i + 1) {
                ans = true;
            }
        }
        return ans;
    }
    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
