import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        String answer = "";
        int j = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (i != indices[j])
                answer += my_string.charAt(i);
            else {
                if (j < indices.length-1)
                    j++;
            }
        }
        return answer;
    }
}