class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        
        if (a != b && b != c && a != c) {
            ;
        } else if (a == b && b == c && a == c) {
            answer *= ((int) Math.pow(a, 2) * 3) * ((int) Math.pow(a, 3) * 3);
        } else {
            answer *= (int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2);
        }
        
        return answer;
    }
}