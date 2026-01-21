class Solution {
    public int solution(int n) {
        int number = 1;    
        while (true) {
            if (n == (int)Math.pow(number, 2))
                return 1;
            if (n < (int)Math.pow(number, 2))
                break;
            else
                number++;
        }
        return 2;
    }
}