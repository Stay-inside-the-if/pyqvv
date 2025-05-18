class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        Long longX = Long.valueOf(x);
        Long originX = longX;
        
        for (int i = 0; i < n; i++) {
            answer[i] = longX;
            longX += originX;
        }
        
        return answer;
    }
}