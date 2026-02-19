package Array;

// In simple way

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > large)
                large = arr[i];
        }

        int secLarge = Integer.MIN_VALUE; // = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > secLarge && arr[i] != large)
                secLarge = arr[i];
        }
        System.out.println(large);
        System.out.println(secLarge);


    }
}
