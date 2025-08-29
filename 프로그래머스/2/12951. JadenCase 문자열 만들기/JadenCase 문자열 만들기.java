class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split(" ", -1);
        
       for (int i = 0; i < arr.length; i++) {
           if (arr[i].length() > 0) {
               answer += Character.toUpperCase(arr[i].charAt(0));
               for (int j = 1; j < arr[i].length(); j++) {
                   answer += arr[i].charAt(j);
               }
            } 
           if (i < arr.length - 1) {
                answer += " ";
            }
        }
        
        return answer;
    }
}