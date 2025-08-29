class Solution {
    public int solution(String s) {
        int answer = 0;
        int first = 0;
        int second = 0;
        char first_ch = s.charAt(0);
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == first_ch) {
                first++;
            } else {
                second++;
            }
            
            if (first == second) {
                answer++;
                if (i + 1 < s.length()) {
                    first_ch = s.charAt(i + 1);
                }
                first = 0;
                second = 0;
            }
        }
        
        if (first != 0 || second != 0) {
            answer++;
        }
        
        return answer;
    }
}