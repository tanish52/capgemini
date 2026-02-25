import java.util.HashMap;

public class Q12 {
  public static void main(String[] args) {
   String s="abcazk";
   int left=0;
   int right=0;
   String s1="";int max=0;

   HashMap <Character,Integer> mp=new HashMap<>();
   while(right<s.length()){
    if(!mp.containsKey(s.charAt(right))){
      mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
      if(right-left+1>max){
        max=right-left+1;
        s1=s.substring(left, right+1);
      }
      right++;
    }
    else{
      while(mp.containsKey(s.charAt(right))){
   mp.remove(s.charAt(left));
    left++;}
  }
   } 
   System.out.print(s1);
  }
}
