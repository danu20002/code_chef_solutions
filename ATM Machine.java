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
        //number of test cases
        int t=sc.nextInt();
        
        while(t>0){
            //number of inputs
            int n=sc.nextInt();
            //total money in atm
            int k=sc.nextInt();
            //String for outPut
            StringBuilder ss=new StringBuilder();
            int[] a=new int[n];
            
            //loop for inputs
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                a[i]=x;
            }
            for(int i=0;i<n;i++){
                if(a[i]<=k){
                    ss.append(1);
                    k=k-a[i];
                }
                else{
                    ss.append(0);
                }
            }
            System.out.println(ss);
            t--;
        }
	}
}
