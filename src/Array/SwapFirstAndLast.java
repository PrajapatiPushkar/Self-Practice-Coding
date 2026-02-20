package Array;

import java.util.Scanner;

public class SwapFirstAndLast {

    public static void swapFirstLast(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return;
        }

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = new int[n];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        swapFirstLast(arr);
        System.out.println("Array after swapping: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
