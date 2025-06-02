import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int mode = -1;        // 최빈값 key
        int maxCount = 0;     // 최빈값 value
        boolean isDuplicate = false;  // 최빈값 중복 여부
        
        int count = 1;  // 현재 숫자 등장 횟수
        int i = 1;
        for (i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    mode = array[i - 1];
                    isDuplicate = false;
                } else if (count == maxCount) {
                    isDuplicate = true;
                }
                count = 1;
            }
        }
        
        if (count > maxCount) {
            mode = array[array.length - 1];
            isDuplicate = false;
        } else if (count == maxCount) {
            isDuplicate = true;
        }
        
        return isDuplicate ? -1 : mode;
    }
}