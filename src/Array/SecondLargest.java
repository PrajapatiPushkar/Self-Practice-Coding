package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        // print
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > large)
                large = arr[i];
        }

        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > secLarge && arr[i] != large)
                secLarge = arr[i];
        }

        System.out.println(large);
        System.out.println(secLarge);



    }
}
