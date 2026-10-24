package Search;

public class BinarySearch{
    public static void main(String[] args) {
        int[] array = {1, 3, 4 , 6, 8, 55, 65, 99};

        System.out.println("Binary Search Algorithm :");
        System.out.println(binarySearch(array, 55));

    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }else if (arr[mid] > target) {
                end = mid - 1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }
}