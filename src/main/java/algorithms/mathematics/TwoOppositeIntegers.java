package algorithms.mathematics;

public class TwoOppositeIntegers {
    public static void main(String[] args) {
        int x = 100, y = -100;
        if (oppositeSigns(x, y)) {
            System.out.println("Signs are opposite");
        }else {
            System.out.println("Signs are not opposite");
        }
    }

    private static boolean oppositeSigns(int x, int y) {
        return (x ^ y) < 0;
    }
}
