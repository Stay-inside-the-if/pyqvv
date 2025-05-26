class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = 1;
        
        while (num * num <= n) {
            if (num * num == n){
                answer = (num+1)*(num+1);
                break;
            }
            num++;
        }
        
        return answer;
    }
}