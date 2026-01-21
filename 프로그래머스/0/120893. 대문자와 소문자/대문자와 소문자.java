class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i)>96 && my_string.charAt(i)<123)
                answer += Character.toUpperCase(my_string.charAt(i));
            else
                answer += Character.toLowerCase(my_string.charAt(i));
        }
        
        return answer;
    }
}