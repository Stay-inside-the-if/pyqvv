class Solution {
    public int[] solution(int[] arr) {
        int answerSize= 0;
        for (int i = 0; i < arr.length; i++) {
            answerSize += arr[i];
        }
        int[] answer = new int[answerSize];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[k] = arr[i]; k++;
            }
        }
        
        return answer;
    }
}