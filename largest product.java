import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            int maxProduct = 0;

        for (int i = 0; i <= n - k; i++) {
            int product = 1;
            for (int j = i; j < i + k; j++) {
                product *= Character.getNumericValue(num.charAt(j));
            }
            maxProduct = Math.max(maxProduct, product);
        }
            System.out.println(maxProduct);
            
        }
    }
}
