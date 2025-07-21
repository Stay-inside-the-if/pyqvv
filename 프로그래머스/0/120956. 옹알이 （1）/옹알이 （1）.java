class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = new String[] {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (babbling[i].contains(words[j])) {
                    babbling[i] = babbling[i].replace(words[j], "*");
                }
            }
            if (babbling[i].replace("*", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
