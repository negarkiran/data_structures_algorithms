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

public class CountingValleys {
    private static final Scanner scanner = new Scanner(System.in);

    static int countingValleys(int n, String s) {

        int altitude = 0;
        int valleyCount = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == 'U') {
                altitude++;
                if (altitude == 0) {
                    valleyCount++;
                }
            } else {
                altitude--;
            }
        }

        return valleyCount;
    }

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        System.out.println(countingValleys(n, s));

        scanner.close();
    }
}
