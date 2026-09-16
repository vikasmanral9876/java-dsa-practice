package recursion.exercise;

public class Recursion6 {
    public static void moveALLX(String str, int count, int idx, String newString) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        if(curChar == 'x') {
            count++;
            moveALLX(str, count, idx+1, newString);
        } else {
            newString += curChar;
            moveALLX(str, count, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveALLX(str, 0, 0, "");
    }
}
