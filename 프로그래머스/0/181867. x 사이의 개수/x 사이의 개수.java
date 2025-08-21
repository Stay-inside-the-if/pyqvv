class Solution {
    public int[] solution(String myString) {
        int[] answer = null;
        String[] words = myString.split("x");
        
        if (myString.substring(myString.length()-1).equals("x")) {
            answer = new int[words.length+1];
        } else {
            answer = new int[words.length];
        }
        
        for (int i = 0; i < words.length; i++) {
            answer[i] = words[i].length();
        }
        return answer;
    }
}