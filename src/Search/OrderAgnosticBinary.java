package Search;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 6, 8, 55, 65, 99 };
        int[] array2 = { 99, 77, 44, 34, 15, 10, 5, 2 };

        System.out.println("Order Agnostic Binary Search Algorithm , This one was in Ascending Order :");
        System.out.println(orderAgnosticBS(array, 55));

        System.out.println("This one was in Descending Order :");
        System.out.println(orderAgnosticBS(array2, 34));
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        if (isAsc) {
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }else{
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }
}
