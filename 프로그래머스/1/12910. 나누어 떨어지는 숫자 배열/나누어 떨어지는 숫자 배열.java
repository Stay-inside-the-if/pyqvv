import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer1 = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer1.add(arr[i]);
            }
        }
        
        int[] answer2 = null;
        if (answer1.size() == 0) {
            answer2 = new int[] { -1 };
        } else {
            answer2 = new int[answer1.size()];
            for (int i = 0; i < answer1.size(); i++) {
                answer2[i] = answer1.get(i);
            }
            Arrays.sort(answer2);
        }
 
        return answer2;
    }
}