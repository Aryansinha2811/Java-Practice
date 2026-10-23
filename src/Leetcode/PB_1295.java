package Leetcode;

public class PB_1295 {
    // Given an array nums of integers, return how many of them contain an even number of digits.
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/2179664714/

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,1234};

        System.out.println(findNumbers(nums));
    }

    static  int findNumbers(int[] nums){
        int count = 0;
        
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){

        int numberofDigits = digits(num);

        if (numberofDigits % 2 == 0) {
            return true;
        }

        return false;
    }

    static int digits(int num){
        int count = 0;

        while (num > 0) {
            count++;
            num = num/10;
        }

        return count;
    }
}
