package recursion.exercise;

import java.util.HashSet;

public class Recursion9 {
    public static void printUniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curChar = str.charAt(idx);

        // to be
        printUniqueSubsequences(str, idx+1, newString+curChar, set);

        // not to be
        printUniqueSubsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequences(str, 0, "", set);
    }
}
