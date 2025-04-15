class Solution {
    public String solution(int n) {
        String answer = "";
        boolean flag = true;
        int i = 0;
        
        while (i < n) {
            if (flag) {
                answer += "수";
                flag = false;
            }
            else {
                answer += "박";
                flag = true;
            }  
            i++;
        }
        
        return answer;
    }
}