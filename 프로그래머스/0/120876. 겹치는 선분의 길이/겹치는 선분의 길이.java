class Solution {
    public int solution(int[][] lines) {
        int[] checkLine = new int[201];
        int answer = 0;
        
        for (int i = 0; i < 3; i++) {
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            
            for (int j = start; j < end; j++) { 
                checkLine[j]++;
            }
        }
        
        for (int i = 0; i < checkLine.length; i++) {
            if (checkLine[i] > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}