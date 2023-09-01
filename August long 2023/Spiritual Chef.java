
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	       Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long m = scanner.nextLong();
            long x = gpSum(k, n, m) % m;
            long y = power(k, n, m) % m;
            System.out.println(x + " " + y);
        }
	}
	static long power(long x, long n, long m) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % m;
            }
            n >>= 1;
            x = (x * x) % m;
        }
        return res;
    }

    static long gpSum(long k, long n, long m) {
        if (n == 1) return 1;
        long res = ((1 + power(k, n / 2, m)) % m * gpSum(k, n / 2, m)) % m;
        if ((n & 1) == 1) {
            res = ((res * k) % m + 1) % m;
        }
        return res;
    }

}
