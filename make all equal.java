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
		int t =sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		 
		    int ar[]=new int[n];
		    int add[]=new int[1001];
		    for(int i=0;i<n;i++){
		        ar[i]=sc.nextInt();
		        add[ar[i]]++;
		    }
		    Arrays.sort(add);
		   System.out.println(n-add[1000]);
		    
		}
	}
}
