class Solution {
    public String solution(String s) {
        String[] words = s.split(" ");
        
        int max = Integer.parseInt(words[0]);
        int min = Integer.parseInt(words[0]);

        for (int i = 1; i < words.length; i++) {
            int num = Integer.parseInt(words[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        return min + " " + max;
    }
}