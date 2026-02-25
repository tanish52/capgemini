public class Q8 {
  public static void main(String[] args) {
    String s="abccba";
    int left=0;
    int right=s.length()-1;
    boolean ispalindrome=true;
    while(left<right){
      if(s.charAt(left)!=s.charAt(right)){
        ispalindrome=false;
        break;
      }
      left++;
      right--;
    }
    String s1="";
    if(ispalindrome){
      s1=s.substring(0,s.length()/2);
      System.out.println(s1);
    }
  }
}
