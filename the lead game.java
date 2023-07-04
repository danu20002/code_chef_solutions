
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
 Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int player1Score = 0;
        int player2Score = 0;
        int maxLead = 0;
        int winner = 0;

        for (int i = 0; i < N; i++) {
            int Si = scanner.nextInt();
            int Ti = scanner.nextInt();
            player1Score += Si;
            player2Score += Ti;
            int lead = Math.abs(player1Score - player2Score);

            if (lead > maxLead) {
                maxLead = lead;
                if (player1Score > player2Score) {
                    winner = 1;
                } else {
                    winner = 2;
                }
            }
        }

        System.out.println(winner + " " + maxLead);
        scanner.close();
    }
}
