import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) > 47 && my_string.charAt(i) < 58)
                count++;
        }
        
        int[] answer = new int[count];
        int j = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) > 47 && my_string.charAt(i) < 58) {
                answer[j] = my_string.charAt(i)-48;
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}