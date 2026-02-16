package Array;

//Count all even and odd in array

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,5,6,2};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }

}
