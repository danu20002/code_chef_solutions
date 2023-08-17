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
		    int xr=sc.nextInt();
		    int yr=sc.nextInt();
		    int d=sc.nextInt();
		    
		    int z=(xr*d);
		    int a=(yr*d);
		    if(x>=z && y>=a){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
