class Solution {
    public int[] solution(long n) {
        String strN = String.valueOf(n);
        int lenN = strN.length();
        int[] answer = new int[lenN]; 
        
        for (int i = 0; i < lenN; i++) {
            answer[i] = Character.getNumericValue(strN.charAt(lenN - i - 1));
        }
        
        return answer;
    }
}