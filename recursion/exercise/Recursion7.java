package recursion.exercise;

public class Recursion7 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplucates(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        if(map[curChar - 'a']) {
            removeDuplucates(str, idx+1, newString);
        } else {
            newString += curChar;
            map[curChar - 'a'] = true;
            removeDuplucates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbcdeefggghggi";
        removeDuplucates(str, 0, "");
    }
}
