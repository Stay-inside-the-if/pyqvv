class Solution {
    public String[] solution(String[] picture, int k) {
        int pl = picture.length;
        String[] answer = new String[pl * k];
        
        for (int i = 0; i < pl; i++) {
            String expendedStr = "";
            for (int j = 0; j < picture[i].length(); j++) {
                char ch = picture[i].charAt(j);
                for (int m = 0; m < k; m++) {
                    expendedStr += ch;
                }
            }
            
            for (int n = 0; n < k; n++) {
                answer[i * k + n] = expendedStr;
            }
        }
        
        return answer;
    }
}