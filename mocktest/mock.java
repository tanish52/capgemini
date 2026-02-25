import java.util.*;
class mock{ 
public static void main(String[] args) {

  int [] arr={5,2,9,1,6};
  for(int i=0;i<arr.length-1;i+=2){
    
    if(arr[i]>arr[i+1]){
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
    }
  }
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  } 
}}