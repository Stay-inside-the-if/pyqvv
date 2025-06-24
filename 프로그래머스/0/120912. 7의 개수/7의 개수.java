class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            while (true) {
                if (array[i] % 10 == 7) {
                    answer += 1;
                }
                if (array[i] / 10 == 0) {
                    break;
                }
                array[i] /= 10;
            }
        }
        
        return answer;
    }
}