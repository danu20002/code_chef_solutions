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
		    int k=sc.nextInt();
		    String s=sc.next();
		    StringBuffer S=new StringBuffer(s);
		   
		        if(s.charAt(0)=='0'){
		            S.setCharAt(0,'1');
		            k--;
		        }else if(s.length() !=n){
		            break;
		        }
		        while(k!=0){A
		            S.append("0");
		            k--;
		        }
		    
		    System.out.println(S);
		    
		}
	}
}
