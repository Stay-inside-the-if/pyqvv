class Solution {
    public int solution(String s) {
        String answer = "";
        
        for (int i = 0; i < s.length(); ) {
            char ch = s.charAt(i);
            if (ch > 47 && ch < 58) {
                answer += ch;
                i++;
            }
            else {
                if (ch == 'z')  { answer += '0';  i += 4; }
                else if (ch == 'o') { answer += '1';  i += 3; }
                else if (ch == 'e') { answer += '8';  i += 5; }
                else if (ch == 'n') { answer += '9';  i += 4; }
                else if (ch == 't') {
                    if (s.charAt(i+1) == 'w') { answer += '2';  i += 3; }
                    else    { answer += '3';  i += 5; }
                }
                else if (ch == 'f') {
                    if (s.charAt(i+1) == 'o') { answer += '4';  i += 4; }
                    else    { answer += '5';  i += 4; }
                }
                else if (ch == 's') {
                    if (s.charAt(i+1) == 'i') { answer += '6';  i += 3; }
                    else    { answer += '7';  i += 5; }
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
}