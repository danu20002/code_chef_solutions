

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Q
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int z=sc.nextInt();
        for(int i=1;i<=z;i++){
           int a= sc.nextInt();
           int b= sc.nextInt();
           int c= sc.nextInt();
           int d= sc.nextInt();
           System.out.println(Math.min(a+b, c+d));
        }
	}
}
