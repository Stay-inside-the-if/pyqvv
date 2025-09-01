class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                for (int n = 0; n < name.length; n++)
                    if (photo[i][j].equals(name[n]))
                        score += yearning[n];
            }
            answer[i] = score;
        }
             
        return answer;
    }
}