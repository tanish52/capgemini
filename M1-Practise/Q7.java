import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int n = sc.nextInt();

        if(n < 2){
            System.out.println(-1);
            return;
        }

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){

            if(arr[i] < min){
                smin = min;
                min = arr[i];
            }
            else if(arr[i] < smin){
                smin = arr[i];
            }
        }

        if(min + smin <= sum){
            System.out.println(min * smin);
        }
        else{
            System.out.println(0);
        }
    }
}