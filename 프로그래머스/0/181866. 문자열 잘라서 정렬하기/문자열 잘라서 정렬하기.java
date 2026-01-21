import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String newString = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                for (int j = i; j < myString.length(); j++)
                    newString += myString.charAt(j);
                break;
            }    
        }
        String[] answer = newString.trim().split("x+");
        Arrays.sort(answer);
        return answer;
    }
}