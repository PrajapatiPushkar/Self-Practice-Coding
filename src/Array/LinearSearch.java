package Array;

//Find the element exits or not

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        boolean isFound = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                System.out.println("found");
                isFound = true;
                break;
            }
        }

        if (isFound == false){
            System.out.println("not found");
        }
    }
}
