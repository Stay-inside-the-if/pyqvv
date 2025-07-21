class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int n = i; n <= j; n++) {
            String strN = String.valueOf(n);
            String temp = strN.replace(String.valueOf(k), "");
            answer += strN.length() - temp.length();
        }
        
        return answer;
    }
}