class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] intArray = new int[n]; 
        
        for (int i = 1; i <= n; i++)
            intArray[i-1] = i;
        
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (n <= sum)
                    break;
            }
            if (sum == n)
                answer++;
        }
    
        return answer;
    }
}