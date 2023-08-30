



import java.util.Scanner;

 class codechef {
    
    public static String findValidAnagram(String S){
        String target = "codechef";
        
        if(S.length() != target.length()){
            return "-1";
        }
        
        char[] sChars = S.toCharArray();
        char[] targetChars = target.toCharArray();
        
        for(int i = 0; i < S.length(); i++){
            if(sChars[i] == targetChars[i]){
                for(int j = 0; j < S.length(); j++){
                    if(sChars[j] != targetChars[i] && sChars[i] != targetChars[j]){
                        char temp = sChars[i];
                        sChars[i] = sChars[j];
                        sChars[j] = temp;
                        break;
                    }
                }
                
                if(sChars[i] == targetChars[i]){
                    return "-1";
                }
            }
        }
        return new String(sChars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        while(t-- > 0){
            String s = scanner.nextLine();
            System.out.println(findValidAnagram(s));
        }
    }
}
