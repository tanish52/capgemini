
class LegacyApi{
  @Deprecated
  void oldmethod(){
    System.out.println("Old Method");
  }
  void newmethod(){
    System.out.println("New Method");
  }
}
public class Q2 {
  public static void main(String[] args) {
    LegacyApi la=new LegacyApi();
    la.oldmethod();
    la.newmethod();
  }
}
