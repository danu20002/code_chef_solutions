import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt(); // Input number
            int result = 1;

            // Calculate LCM of numbers from 1 to n
            for (int i = 2; i <= n; i++) {
                result = lcm(result, i);
            }

            System.out.println(result); // Print the LCM
        }
        
        in.close(); // Close the scanner
    }
}
