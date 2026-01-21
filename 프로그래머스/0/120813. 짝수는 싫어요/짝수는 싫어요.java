class Solution {
    public int[] solution(int n) {
        int arraySize = 0;
        
        if (n % 2 == 0)
            arraySize = n/2;
        else
            arraySize = n/2+1;
        
        int[] answer = new int[arraySize];
        
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[j] = i;
                j++;
            }
        }
        
        return answer;
    }
}