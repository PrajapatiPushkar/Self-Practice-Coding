package TCSNQTQuestionCoding;

import java.util.Scanner;

public class MaximumConsecutive {

    public static int maxConsecutive(int[] arr) {
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i - 1]){
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of the array: ");

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum consecutive 0's or 1's : " + maxConsecutive(arr));
    }
}
