public class Q10 {
  public static void main(String[] args) {
    String s="aaabbcdddee";
    int count=1;
    StringBuilder str=new StringBuilder();
   
    for(int i=0;i<s.length()-1;i++){
      
      if(s.charAt(i)==s.charAt(i+1)){
        count++;
      }
      else{
       str.append(s.charAt(i));
        str.append(count);
        count=1;
      }
    }
    str.append(s.charAt(s.length()-1));
    str.append(count);
    System.out.print(str.toString());
  }
}
