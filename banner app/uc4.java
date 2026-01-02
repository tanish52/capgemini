import java.util.*;

public class uc4{
  
static class oopsbannerapp{

  char ch;
  String [] pattern;

  public oopsbannerapp(Character ch,String[] pattern){
    this.ch=ch;
    this.pattern=pattern;
  }

  public  Character getCharacter(){
    return ch;
  }

  public String[] getpattern(){
    return pattern;
  } 
  public static oopsbannerapp[] createCharacterPatternMaps() {
    return new oopsbannerapp[]{
      new oopsbannerapp('O',new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "

      } ),new oopsbannerapp('P', new String[]{
            " *****   ",
            "*     *  ",
            "*     *  ",
            " *****   ",
            "*        ",
            "*        ",
            "*        "
      }),
      new oopsbannerapp('S', new String[]{
            " *****   ",
            "*        ",
            "*        ",
            " *****   ",
            "       * ",
            "       * ",
            " *****   "
      }),new oopsbannerapp(' ', new String[]{
        "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        "
      })
    };

}
 public static String[] getCharacterpatter(char ch,oopsbannerapp[] arr){
  for(oopsbannerapp obj:arr){
    if(obj.getCharacter()==ch){
      return obj.getpattern();
    }
  }
  return new String[]{
    "         ",
    "         ",
    "         ",
    "         ",
    "         ",
    "         ",
    "         "

  };}

  public static void pp(String message,oopsbannerapp[] ch){
    int height=7;
    for(int row=0;row<7;row++){
      StringBuilder str=new StringBuilder();
      for(int i=0;i<message.length();i++){
        char c=message.charAt(i);
        String[] pattern=getCharacterpatter(c,ch );
        str.append(pattern[row]).append("  ");
      }
      System.out.println(str.toString());
    }
  };

 };



  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   
    oopsbannerapp[] cha=oopsbannerapp.createCharacterPatternMaps();
    oopsbannerapp.pp("OOPS", cha);
}



}