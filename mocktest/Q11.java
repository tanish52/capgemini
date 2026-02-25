public class Q11 {
  public static void main(String[] args) {
    String s="Java Programming";
    s=s.toLowerCase();
    StringBuilder s1=new StringBuilder(s);
    
      
    for(int i=0;i<s.length();i+=2){
      char ch=s.charAt(i);
      while(ch==' '){
        ch=s.charAt(i+1);
        i++;
      }
      ch=Character.toUpperCase(ch);
      s1.setCharAt(i,ch);
    }
    System.out.print(s1.toString());
  }
}
