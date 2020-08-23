package hackerrank.warmup;

//Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography.
// During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step.
// Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. We define the following terms:
//
//A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
//
//For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high.
// Finally, he returns to sea level and ends his hike.

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class CountingValleysUsingStack {
    private static final Scanner scanner = new Scanner(System.in);
    private static Stack<Character> mountain = new Stack();
    private static Stack<Character> valley = new Stack();

    static int countingValleys(int n, String s) {

        int valleyCount = 0;
        int mountainCount = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == 'U') {
                if (!valley.isEmpty()) {
                    valley.pop();
                    if (valley.isEmpty()) {
                        valleyCount++;
                    }
                } else {
                    mountain.push(ch);
                }
            } else {
                if (!mountain.isEmpty()) {
                    mountain.pop();
                    if (mountain.isEmpty()) {
                        mountainCount++;
                    }
                } else {
                    valley.push(ch);
                }
            }
        }

        return valleyCount;
    }

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        scanner.close();
    }
}
