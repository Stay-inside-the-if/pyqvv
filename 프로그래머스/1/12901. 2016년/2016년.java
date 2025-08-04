class Solution {
    public String solution(int a, int b) {
        String[] answer = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int day = 0;
        
        for (int i = 1; i < a; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> day += 31;
                case 2 -> day += 29;
                default -> day += 30;
            }
        }
        day += b;
        
        return answer[day % 7];
    }
}