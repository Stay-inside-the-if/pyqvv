class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.toLowerCase().charAt(i);
            if (ch == 'a') answer += 'A';
            else answer += ch;
        }
        return answer;
    }
}