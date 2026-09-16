package recursion.advancedRecursion;

public class Recursion3 {
    public static int printPlacements(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        // vertical placements
        int vertPlacements = printPlacements(n-m, m);

        // horizontal placements
        int horzPlacements = printPlacements(n-1, m);
        
        return vertPlacements + horzPlacements;
    }
    public static void main(String[] args) {
        int n = 5, m = 3;
        System.out.println(printPlacements(n, m));
    }
}
