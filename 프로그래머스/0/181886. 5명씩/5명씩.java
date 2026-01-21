class Solution {
    public String[] solution(String[] names) {
        int answerSize = 0;
        if (names.length % 5 == 0)
            answerSize = names.length/5;
        else
            answerSize = names.length/5+1;
        String[] answer = new String[answerSize];
        int j = 0;
        for(int i = 0; i < names.length; i++) {
            if ((i+1)%5==1) {
                answer[j] = names[i];
                j++;
            }
        }
        return answer;
    }
}