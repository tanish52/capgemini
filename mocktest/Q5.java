import java.util.*;
public class Q5 {
  public static void main(String[] args) {
    int [] arr={16,17,4,3,5,2};
    List<Integer> li=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      boolean isgreater=true;
      for(int j=i+1;j<arr.length;j++){
          if(arr[i]<arr[j]){
            isgreater=false;
          }
      }
      if(isgreater){
        li.add(arr[i]);
      }
    }
    for(int i:li){
      System.out.print(i+" ");
    }
  }
}
