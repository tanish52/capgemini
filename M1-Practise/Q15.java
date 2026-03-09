import java.util.Scanner;
import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int evenSize = (n + 1) / 2;
        int oddSize = n / 2;

        int[] evenArr = new int[evenSize];
        int[] oddArr = new int[oddSize];

        int ei = 0, oi = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) {
                evenArr[ei++] = arr[i];
            } else {
                oddArr[oi++] = arr[i];
            }
        }

        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        int secondLargestEven = evenArr[evenArr.length - 2];
        int secondLargestOdd = oddArr[oddArr.length - 2];

        int sum = secondLargestEven + secondLargestOdd;
        System.out.println(sum);
    }
}