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
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    if((x*y)%z==0){
		        System.out.println((x*y)+" "+z);
		    }else if((x*z)%y==0){
		        System.out.println((x*z)+" "+y);
		    }else if((y*z)%x==0){
		        System.out.println((y*z)+" "+x);
		    }else{
		        System.out.println(-1);
		    }
		}  
		    
	}
}
