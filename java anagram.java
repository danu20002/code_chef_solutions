import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int z=a.length();
        int y=b.length();
        
        if(z==y){
            a=a.toLowerCase();
            b=b.toLowerCase();
            char[] arra=a.toCharArray();
            char[] arrb=b.toCharArray();
            int suma=0;
            int sumb=0;
            for(int i=0;i<z;i++){
                suma+=arra[i];
                sumb+=arrb[i];
                
            }
            if(sumb==suma)
                return true;
                
            return false;
            
            
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
