import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean checkBits(int n) {
        // Write your code here.
        String binary=Integer.toBinaryString(n);
        for(int i=0;i<binary.length()-1;i++){
            if(binary.charAt(i) == binary.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
             int n=sc.nextInt();
         boolean result=checkBits(n);
         System.out.println(result);
         }
         
         

    }
}
