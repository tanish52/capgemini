import java.util.*;
public class Q5 {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  HashMap<Integer,Integer> mp=new HashMap<>();
  int target=sc.nextInt();
  for(int i=0;i<n;i++){
    int need=target-arr[i];
    if(mp.containsKey(need)) {
      System.out.println("Indices are "+i+"  "+ mp.get(need));
      return;
    }
    mp.put(arr[i],i);
  }
  System.out.println("Not found");
}
}
