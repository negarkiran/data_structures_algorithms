package algorithms.mathematics;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> primeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        // Print the number of 2s that divide n
        while (number%2==0)
        {
            System.out.print(2 + " ");
            factors.add(2);
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides n, print i and divide n
            while (number%i == 0)
            {
                System.out.print(i + " ");
                factors.add(i);
                number /= i;
            }
        }
        //If n is prime
        if (number > 2)
            System.out.println(number);
            factors.add(number);
        return factors;
    }
}
