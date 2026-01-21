class Solution {
    public int[] solution(int[] arr) {
        int answerSize = 1;
        while (true) {
            if (arr.length != answerSize) {
                if (arr.length < answerSize) {
                    break;
                }
                answerSize *= 2;
            }
            else
                break;
        }
        int[] answer = new int[answerSize];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}