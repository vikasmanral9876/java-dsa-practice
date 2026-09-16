package recursion;

public class fibonacci {
    public static void printFibonacci(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        System.out.println(a);
        printFibonacci(b, a+b, n-1);
        
    }
    public static void main(String[] args) {
        printFibonacci(0, 1, 6);
    }
}
