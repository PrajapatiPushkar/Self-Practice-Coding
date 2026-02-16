package Array;

// Find the minimum element in the array

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {5,2,34,34,5,64,34,99};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
