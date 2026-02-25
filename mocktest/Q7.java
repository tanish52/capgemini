public class Q7 {
  public static void main(String[] args) {
    String s="I love Java Programming very much";
    String [] str=s.split("\\s+");
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<str.length;i++){
      StringBuilder s2=new StringBuilder();
      if(i%2==1){
        s2.append(str[i]).reverse();
        s2.append(" ");

      }
      else{
        s2.append(str[i]);
        s2.append(" ");
      }
      s1.append(s2);
    }
    System.out.print(s1.toString().trim());
  }
}
