package algorithms.bitwise;

public class Swap {
    public static void main(String[] args) {
        int x = 3, y = 4;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println(x + " " + y);
    }
}
