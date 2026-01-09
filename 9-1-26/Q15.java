import java.util.Scanner;
import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      Set<Integer> set=new HashSet<>();
      Set<Integer> set2=new HashSet<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
          if(set.contains(arr[i]))set2.add(arr[i]);
          set.add(arr[i]);
        }
System.out.println(set2);
            }
}
