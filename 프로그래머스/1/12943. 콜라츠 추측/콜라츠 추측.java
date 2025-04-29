class Solution {
    public int solution(int num) {
        int answer = 0;
        double doubleNum = (double)num; 
        
        for (; answer < 500; answer++) {
            if (doubleNum == 1.0) {
                return answer;
            }
            else {
                if (doubleNum % 2.0 == 0.0) {
                    doubleNum = doubleNum / 2.0;
                }
                else {
                    doubleNum = doubleNum * 3.0 + 1.0;
                }
            }
        }
        return -1;
    }
}