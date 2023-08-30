// import java.util.*;
// import java.lang.*;
// import java.io.*;

//  class Codechef {

//     public static void main (String[] args) throws java.lang.Exception {
//         Scanner sc =new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0){
//             int L=sc.nextInt();
//             int K=sc.nextInt();
//             int N=sc.nextInt();
            
//             int[] arr=new int[L];
//             for(int i=0;i<L;i++){
//                 arr[i]=sc.nextInt();
//             }

//             // Reverse the array.
          
//         Arrays.sort(arr);
//         for (int i = 0; i<arr.length / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[arr.length - 1 - i];
//             arr[arr.length - 1 - i] = temp;
//         }
        
            
//             int deliciousness = 0;
//             for (int i = 0; i<L; i ++) {
//                 for(int j=)
//                 if ((i+1)== N) {
//                     // You are the current customer.
//                     deliciousness += arr[i];
//                     increment(N);
//                     break;
                    
//                 }
//             }

//             // Print the total deliciousness of the pastries you bought.
//             System.out.println(deliciousness);
//         }
//     }
//     public static int increment(int n){
//         n+=n;
//         return n;
//     }
// }
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
         
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int l = scanner.nextInt();
            
            PriorityQueue < Integer > deliciousnessQueue = new PriorityQueue  <> (n, (a, b) -> b - a);
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                deliciousnessQueue.add(a);
            }
            long totalDeliciousness = 0;
            int currentPerson = 1;
            while (!deliciousnessQueue.isEmpty()) {
                if (currentPerson == l) {
                    totalDeliciousness += deliciousnessQueue.poll();
                } else {
                    deliciousnessQueue.poll();
                }
                currentPerson = (currentPerson % k) + 1;
            }
            
            System.out.println(totalDeliciousness);
        }
        
        scanner.close();
    }
}
