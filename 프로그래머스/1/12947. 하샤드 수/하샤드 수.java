class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int originX = x;
        int sum = 0;
        
        while (x!=0) {
            sum += x%10;
            x /= 10;
        }
        
        if ((originX%sum) != 0)
            answer = false;
        
        return answer;
    }
}