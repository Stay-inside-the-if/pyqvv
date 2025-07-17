import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 65 && ch <= 90) {
                answer += (char)(ch + 32);
            } else {
                answer += (char)(ch - 32);
            }
        }
        
        System.out.println(answer);
    }
}