package recursion.exercise;

public class Recursion8 {
    public static void printSubsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);

        // to be
        printSubsequences(str, idx+1, newString+curChar);

        // not to be
        printSubsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}
