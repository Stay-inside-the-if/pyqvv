class Solution {
    public String[] solution(String[] str_list) {
        int str_len = str_list.length;
        String[] answer = null;
        for (int i = 0; i < str_len; i++) {
            if (str_list[i].equals("l")) {
                answer = new String[i];
                for (int j = 0; j < i; j++) {
                        answer[j] = str_list[j];   
                }
                return answer;
            }
            if (str_list[i].equals("r") && (i < (str_len - 1))) {
                answer = new String[str_len - i - 1];
                for (int j = 0; j < str_len - i - 1; j++) {
                    answer[j] = str_list[i+j+1];
                }
                return answer;
            }
        }
        answer = new String[0];
        return answer;
    }
}