class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        String answer = "";
        
        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i < words[j].length(); i++) {
                char ch = words[j].charAt(i);
                if (i % 2 != 0) {
                    if (64 < ch && ch < 91)
                        answer += (char)(ch + 32);
                    else
                        answer += ch;
                } else {
                    if (96 < ch && ch < 123)
                        answer += (char)(ch - 32);
                    else
                        answer += ch;
                }     
            }
            
            if (j != words.length - 1) {
                answer += " ";
            }
        }    
        
        return answer;
    }
}