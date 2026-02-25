public class Q9 {
  public static void main(String[] args) {
    String s="abcd";
    String s2="XYZ";
    int i=0;
    int j=0;
    String str="";
    while(i<s.length() && j<s2.length()){
      str+=s.charAt(i);
      str+=s2.charAt(j);
      i++;
      j++;
    }
    while(i<s.length()){
      str+=s.charAt(i);
      i++;
    }
    while(j<s2.length()){
      str+=s2.charAt(j);
      j++;
    }
    System.out.print(str);
  }
}
