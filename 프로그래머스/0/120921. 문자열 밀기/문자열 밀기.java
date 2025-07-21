class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                answer = 0;
                break;
            }
            else {
                String newB = "";
                for (int j = A.length() - i - 1; j < A.length(); j++) {
                    newB += A.charAt(j);
                }
                for (int j = 0; j < A.length() - i - 1; j++) {
                    newB += A.charAt(j);
                }
                if (B.equals(newB)) {
                    answer = i + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}