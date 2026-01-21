class Solution {
    public int solution(String my_string) {
        my_string = my_string.toLowerCase();
        String newStr = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) < 57) {
                for (int j = i; j < my_string.length(); j++) {
                    newStr += my_string.charAt(j);
                }
                break;
            }
        }
        String[] arr = newStr.trim().split("[qwertyuiopasdfghjklzxcvbnm]+");
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != "")
                answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}