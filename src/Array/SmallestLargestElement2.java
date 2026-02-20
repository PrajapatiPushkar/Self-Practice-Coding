package Array;

import java.util.Scanner;

public class SmallestLargestElement2 {

    public static void findSmallestAndLargest(int[] arr){

        if (arr == null || arr.length == 0){
            System.out.println("Array is empty. ");
            return;
        }

        int small = arr[0];
        int large = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < small) {
                small = arr[i];
            }

            if (arr[i] > large){
                large = arr[i];
            }
        }

        System.out.println("Smallest Element: " + small);
        System.out.println("Largest Element: " + large);

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Invalid array size.");
            return;
        }

        int[] arr = new int[n];

        System.out.print("Enter the element: ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        findSmallestAndLargest(arr);

    }
}
