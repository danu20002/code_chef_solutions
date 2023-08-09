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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
            int r=sc.nextInt();
		    int a=(r/30);
		    int b=(x+a);
		    int c=b/y;
		    if(b%y==0){
		        System.out.println(c);
		    }else{
		        System.out.println(c+1);
		    }
		}
	}
}
