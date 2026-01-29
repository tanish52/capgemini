import java.util.*;
public class Q3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<arr.length;i++){
      int need=target-arr[i];
      if(mp.containsKey(need)){
        System.out.println("Found");
       return;
      }
      mp.put(arr[i],i);
    }
    System.out.println("Not found");
   
        }
    
  }
