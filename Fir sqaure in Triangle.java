/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef

{
    static int maxSquaresInTriangle(int base) {
        int totalSquares = 0;
        for (int i = 1; i <= (base / 2)-1; i++) {
            totalSquares += i;
        }
        return totalSquares;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Read the number of test cases

        // Process each test case
        for (int t = 0; t < T; t++) {
            int B = scanner.nextInt();  // Read the base length
            int result = maxSquaresInTriangle(B);  // Calculate the result
            System.out.println(result);
        }
		
	}
}
