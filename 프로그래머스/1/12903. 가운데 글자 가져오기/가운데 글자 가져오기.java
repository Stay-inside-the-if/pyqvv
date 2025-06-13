class Solution {
    public String solution(String s) {
        int s_len = s.length();
        
        if (s_len % 2 == 0) {
            s = s.substring(s_len/2-1, s_len);
            s = s.substring(0, 2);
        } else {
            s = s.substring(s_len/2, s_len);
            s = s.substring(0, 1);
        }
        return s;
    }
}