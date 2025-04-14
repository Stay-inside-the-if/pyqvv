class Solution {
    public String solution(int num) {
        if (num != 0) {
            if ((num % 2) != 0) {
                return "Odd";
            }
        }
        return "Even";
    }
}