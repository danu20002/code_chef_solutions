import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Convert the strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Check if the lengths of the strings are equal
        if (a.length() != b.length()) {
            return false;
        }
        
        // Initialize an array to hold character frequencies
        int[] charFrequency = new int[26]; // Assuming only English alphabetic characters
        
        // Iterate over string a to update character frequencies
        for (char c : a.toCharArray()) {
            charFrequency[c - 'a']++;
        }
        
        // Iterate over string b to decrement character frequencies
        for (char c : b.toCharArray()) {
            charFrequency[c - 'a']--;
        }
        
        // Check if all character frequencies are zero
        for (int frequency : charFrequency) {
            if (frequency != 0) {
                return false;
            }
        }
        
        return true;
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
