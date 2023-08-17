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
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int count=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        
		    }
		    Arrays.sort(a);
		    for(int i=0;i<n-1;i++){
		        if(a[i]!=a[i+1]){
		            count++;
		        }
		        System.out.println(count+1);
		    }
		}
	}
}
