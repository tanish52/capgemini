
import java.util.*;
public class uc5 {

   static class BannerCharacter {
        private char character;
        private String[] pattern;
        public BannerCharacter(char character,String[] pattern) {
            this.character=character;
            this.pattern=pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void main(String[] args) {
        Map<Character, BannerCharacter> bannerMap=buildCharacterMap();
        printBanner("OOPS",bannerMap);
    }
    public static Map<Character,BannerCharacter> buildCharacterMap() {
        Map<Character,BannerCharacter> map=new HashMap<>();
        map.put('O',new BannerCharacter('O',new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                " *****   "
        }));
        map.put('P',new BannerCharacter('P',new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                " *****   ",
                "*        ",
                "*        ",
                "*        "
        }));
        map.put('S',new BannerCharacter('S',new String[]{
                " *****   ",
                "*        ",
                "*        ",
                " *****   ",
                "      *  ",
                "      *  ",
                " *****   "
        }));
        return map;
    }
    public static void printBanner(String text,Map<Character,BannerCharacter> map) {
        for (int row= 0;row<7;row++) {
            for (char ch:text.toCharArray()) {
                BannerCharacter bc=map.get(ch);
                System.out.print(bc.getPattern()[row]);
            }
            System.out.println();
        }
    }
}