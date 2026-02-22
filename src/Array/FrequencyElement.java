package Array;

import java.util.Scanner;

public class FrequencyElement {

    public static int countElement(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find frequency:");
        int target = sc.nextInt();

        int result = countElement(arr, target);
        System.out.println("Frequency of " + target + " is: " + result);
    }
}
