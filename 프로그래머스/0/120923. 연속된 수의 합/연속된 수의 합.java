class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for (int i = total+num; i >= -1000; i--) {
            
            int sum = 0;
            int count = 0;
            
            for (int j = i; count < num; j--) {
                sum += j;
                count++;
            }
            
            if (sum == total) {
                for (int k = num-1; k != -1; k--) {
                    answer[k] = i;
                    i--;
                }
                return answer;
            }
        }    
        
         return answer;
    }
}