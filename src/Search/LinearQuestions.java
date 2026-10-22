package Search;

public class LinearQuestions {
    public static void main(String[] args) {
        int[] array = {20, 888, 77, 6, 542, 100};
        int target = 20;
        System.out.println("Here we gave Range in the Array to Search, If -1 is given then the Element is not present in the Array");

        System.out.println(SearchInRange(array, target, 2, 4));

        System.out.println("Here we Find Minimum in Array");
        System.out.println(minimum(array));

        System.out.println("Here we Find Maximum in Array");
        System.out.println(maximum(array));

    }


    // Q1. We have to search in the given range of array i.e., [1,4]

    static int SearchInRange(int[] arr,int target, int Start,int End){
        // Here we consider that Array is not Empty
        for(int index = Start; index <= End; index++){
            int element = arr[index];

            if (element == target) {                
                return index;
            }
        }
        return -1;
    }

    // Write Method to find minimum Element value in the Array
    static int minimum(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int maximum(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
