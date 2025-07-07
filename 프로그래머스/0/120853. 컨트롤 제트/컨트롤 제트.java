class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] words = s.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].equals("Z"))) {
                answer += Integer.parseInt(words[i]);
            } else {
                answer -= Integer.parseInt(words[i-1]);
            }
        }
        
        return answer;
    }
}