class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] available = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {   
            String word = babbling[i];
            String last = "";
            
            while(true) {
                int j;
                for (j = 0; j < available.length; ) {
                    if (word.startsWith(available[j]) && !available[j].equals(last)) {
                        last = available[j];
                        word = word.substring(available[j].length());
                        break;
                    }
                    j++;
                }
                if (j == available.length)
                    break;
                if (word.length() == 0) {
                    answer++;
                    break;
                }
            }
            
        }
        
        return answer;
    }
}