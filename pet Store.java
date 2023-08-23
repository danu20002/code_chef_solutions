/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    HashMap<Integer,Integer> hm = new HashMap<>();
		    for(int i = 0; i < n; i++){
		      int k = sc.nextInt();
		      hm.put(k,hm.getOrDefault(k,0) + 1);
		    }
		    boolean isTrue = true;
		    for(Integer i : hm.keySet()){
		        if(hm.get(i)%2 != 0){
		            isTrue = false;
		        }
		    }
		    if(isTrue){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
