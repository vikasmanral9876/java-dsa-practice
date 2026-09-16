package recursion.exercise;

public class Recursion3 {
    public static void revString(String s, int idx) {
        if(idx == 0) {
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        revString(s, idx-1);
    }
    public static void main(String[] args) {
        String s = "abcd";
        revString(s, s.length() - 1);
    }
}
