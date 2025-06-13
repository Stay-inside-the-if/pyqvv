import java.util.Arrays;

class Solution {
    public long solution(String numbers) {
        String alphabet[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String answer = "";
        
        while(numbers.length() != 0) {
            for (int i = 0; i < 10; i++) {
                if (numbers.startsWith(alphabet[i])) {
                    answer += String.valueOf(i);
                    numbers = numbers.substring(alphabet[i].length());
                    break;
                }
            } 
        }
        
        return Long.valueOf(answer);
    }
}