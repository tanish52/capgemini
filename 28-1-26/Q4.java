import java.util.*;
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int num:arr){
      mp.put(num,mp.getOrDefault(num,0)+1);
    }
    int max1=0;
    for(int i=0;i<n;i++){
      if(!mp.containsKey(arr[i]-1)){
        int current=arr[i];
        int length=1;
        while(mp.containsKey(current+1)){
          current+=1;
          length+=1;
        }
        max1=Math.max(max1,length);
      }
    }
    System.out.println("Maxlength is "+max1);

    
  } 
}
