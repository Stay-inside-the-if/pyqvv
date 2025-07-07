class Solution {
    public String[] solution(String[] quiz) {
        String[] answer =  new String[quiz.length]; 
        
        for (int i = 0; i < quiz.length; i++) {
            String[] words = quiz[i].split(" ");
            if (words[1].equals("+")) {
                if (Integer.parseInt(words[0]) + Integer.parseInt(words[2]) == Integer.parseInt(words[4])) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            } else {
                if (Integer.parseInt(words[0]) - Integer.parseInt(words[2]) == Integer.parseInt(words[4])) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}