class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (int i = 0; i < order.length; i++) {
            if (order[i].startsWith("cafelatte") || order[i].endsWith("cafelatte")) {
                answer += 5000;
            }
            else {
                answer += 4500;
            }
        }
        return answer;
    }
}