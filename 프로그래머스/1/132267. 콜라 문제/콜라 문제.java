class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int keep = 0;
        int newCoke = 0;
        
        while (n >= a) {
            if (n % a != 0) {
                keep += (n % a);
            }
            newCoke = (n / a) * b; 
            answer += newCoke;      
            n = newCoke + keep; 
            keep = 0;
        }
        
        return answer;
    }
}