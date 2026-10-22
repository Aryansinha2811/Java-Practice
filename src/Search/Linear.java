package Search;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {18, 192, 172, 54, 90, 100};

        int target = 100;

        int answer = SearchIndex(arr , target);
        int answer2 = SearchElement(arr, target);
        // We can Make a Boolean Function Also by Return type as True or False only 

        System.out.println(answer);
        System.out.println(answer2);

        String name = "Aryan";
        char target2 = 'A';

        System.out.println(SearchString(name, target2));
    }

    static int SearchIndex(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        // Here used basic For loop 
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];

            if (element == target) {                
                return index;
            }
        }
        return -1;
    }

    static int SearchElement(int[] arr, int target){

        // Here I used Integer.MAX_VALUE Because -1 can be the Element Present in Array 

        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        
        // Used Enhanced For each Loop here to show other ways
        for (int element : arr) {

            if (element == target) {
                return element;
            }
        }

        // Base Case
        return  Integer.MAX_VALUE;
    }

    static boolean SearchString(String name , char target){

        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }

        // Below Here I used For Each Loop 

        // for(char ch: name.toCharArray()){
        //     if (ch == target) {
        //         return true;
        //     }
        // }

        return false;
    }
}
