package Array;

//Find maximum element in array

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {2, 3,4, 5,6, 7,7,3,8};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
