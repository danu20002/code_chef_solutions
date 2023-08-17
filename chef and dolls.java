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
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i=0;i<n-1;i+=2){
		        if(arr[i]==arr[i+1]){
		            continue;
		        }else{
		            System.out.println(arr[i]);
		            break;
		        }
		    }
		    }
	}
}
