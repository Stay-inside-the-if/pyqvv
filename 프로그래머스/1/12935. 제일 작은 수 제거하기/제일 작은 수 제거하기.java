class Solution {
    public int[] solution(int[] arr) {
        int[] answer = null;
        
        if (arr.length == 1) {
             answer = new int[] { -1 };
        } else {
            answer = new int[arr.length - 1];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            
            int i = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != min) {
                    answer[i] = arr[j];
                    i++;
                }
            }
        }
        
        return answer;
    }
}