package datastructures.array.rotation;

//Time complexity : O(n)
//Auxiliary Space : O(1)

public class ArrayRotationUsingJugglingAlgorithm {
    private int[] numbers;
    private int size;

    public ArrayRotationUsingJugglingAlgorithm(int n) {
        this.numbers = new int[n];
        this.size = 0;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void add(int n) {
        numbers[size++] = n;
    }

    private int gcd(int a, int b) {
        if (b==0)
            return a;
        return gcd(b, a%b);
    }

    public void rotateLeft(int d) {
        //When d > n
        d = d % size;

        int i,j,k, temp;
        int gcd = gcd(d, size);
        for (i = 0; i <gcd; i++) {
            temp = numbers[i];
            j = i;

            while (true) {
                k = j + d;
                if (k >= size)
                    k = k - size;
                if (k == i)
                    break;
                numbers[j] = numbers[k];
                j = k;
            }
            numbers[j] = temp;
        }
    }

}
