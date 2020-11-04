package algorithms.bitwise;

public class BitWiseOperations {
    public static void main(String[] args) {
        int num = 2;
        System.out.println("Before Negation:" + num);
        System.out.println("After Negation:" + ~num);

        int a = 3, b = 5;
        System.out.println("a & b: " + (a & b)); //AND
        System.out.println("a | b: " + (a | b)); //OR
        System.out.println("a ^ b: " + (a ^ b)); // XOR
        System.out.println("a << 1: " + (a << 1)); //Multiply by 2 power 1
        System.out.println("a >> 1: " + (a >> 1)); //Divide by 2
        System.out.println("a >>> 1: " + (-2 >>> 1)); //Divide by 2
    }
}
