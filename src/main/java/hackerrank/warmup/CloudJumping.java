package hackerrank.warmup;

//Emma is playing a new mobile game that starts with consecutively numbered clouds.
// Some of the clouds are thunderheads and others are cumulus.
// She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2.
// She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud.
// It is always possible to win the game.
//
//For each game, Emma will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.
// For example, c= {0, 1, 0, 0, 0, 1, 0}  indexed from 0...6.
// The number on each cloud is its index in the list so she must avoid the clouds at indexes 1 and 5.
// She could follow the following two paths: 0 -> 2 -> 4 -> 6  or 0->2->3->4->6. The first path takes 3 jumps while the second takes 4.

import java.io.IOException;
import java.util.Scanner;

public class CloudJumping {
    static int jumpingOnClouds(int[] c) {
        int length = c.length;
        int i = 0;
        int jump = 0;
        while(i < length -1) {
            if (i == length - 2) {
                jump++;
                break;
            }
            if (c[i+2] == 1) {
                i = i + 1;
                jump++;
            } else {
                i = i + 2;
                jump++;
            }
        }
        return jump;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println(jumpingOnClouds(c));


        scanner.close();
    }
}
