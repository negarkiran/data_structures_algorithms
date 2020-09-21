package algorithms.mathematics;

public class LCM {
    public int find(int a, int b){
        GCD gcd = new GCD();
        return (a * b) / gcd.find(a,b);
    }
}
