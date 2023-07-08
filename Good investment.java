/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read X and Y for the current test case
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Check if the investment is good
            String result = isInvestmentGood(X, Y);

            // Print the result
            System.out.println(result);
        }

        scanner.close();
    }

    public static String isInvestmentGood(int X, int Y) {
        if (X >= 2 * Y) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
