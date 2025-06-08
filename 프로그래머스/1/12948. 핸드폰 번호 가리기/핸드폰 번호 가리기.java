class Solution {
    public String solution(String phone_number) {
        
        int numLen = phone_number.length();
        String lastFour = phone_number.substring(numLen-4,numLen);
        
        String answer = "";
        for (int i = 0; i < numLen-4; i++) {
            answer += "*";
        }
        answer += lastFour;
        return answer;
    }
}