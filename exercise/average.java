import java.util.Scanner;

public class average {
    public static int averageNumbers(int a, int b, int c) {
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = averageNumbers(a, b, c);
        System.out.println(avg);
    }
}
