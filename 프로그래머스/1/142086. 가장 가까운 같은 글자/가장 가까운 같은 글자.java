import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] s_char = new char[s.length()];
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            s_char[i] = s.charAt(i);
        }
        
        for (int i = 0; i < s_char.length; i++) {
            if (!list.contains(s_char[i])) {
                answer[i] = -1;
                list.add(s_char[i]);
            } else {
                for (int j = 0; j < i; j++) {
                    if (s_char[i] == s_char[j])
                        answer[i] = i - j;
                }
            }
        }
       
        return answer;
    }
}