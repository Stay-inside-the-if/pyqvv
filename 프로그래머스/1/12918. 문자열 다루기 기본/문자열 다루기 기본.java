class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if ((s.length() != 4) && (s.length() != 6)) {
            answer = false;
        } 
        if (s.matches(".*[a-zA-Z].*")) {
           answer = false;
        }
        
        return answer;
    }
}