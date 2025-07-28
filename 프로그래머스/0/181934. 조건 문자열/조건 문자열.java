class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = true;
        
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                if ((m - n) >= 0)
                    return 1;
            } else {
                if ((m - n) > 0)
                    return 1;
            }
        } else {
            if (eq.equals("=")) {
                if ((n - m) >= 0)
                    return 1;
            } else {
                if ((n - m) > 0)
                    return 1;
            }
        }
        
        return 0;
    }
}