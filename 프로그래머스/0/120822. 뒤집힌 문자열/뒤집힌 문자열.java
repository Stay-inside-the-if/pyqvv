class Solution {
    public String solution(String my_string) {
        String answer = "";
        int my_stringLen = my_string.length();
        
        for (int i = 0; i < my_stringLen; i++) {
            answer += my_string.charAt(my_stringLen-1-i);
        }
        
        return answer;
    }
}