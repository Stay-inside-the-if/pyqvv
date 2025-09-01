class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        
        int i = 0;
        int n = 0;
        int m = 0;
        
        for (; i < goal.length; i++) {
            if (n < cards1.length && goal[i].equals(cards1[n]))
                n++;
            else if (m < cards2.length && goal[i].equals(cards2[m]))
                m++;
            else
                break;
        }
        
        if (i == goal.length)
            answer = "Yes";
        
        return answer;
    }
}