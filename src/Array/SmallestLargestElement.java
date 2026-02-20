package Array;

import java.util.Scanner;

public class SmallestLargestElement {

    public static int smallestElement(int[] arr){
        int small = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }

    public static int largeElement(int[] arr){
        int large =  arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(smallestElement(arr));
        System.out.println(largeElement(arr));
    }
}
