class Solution {
    public int[] solution(int n) {
        int count = 0;
        int copyN = n;
        while (copyN != 1) {
            if (copyN % 2 == 0)
                copyN /= 2;
            else
                copyN = 3*copyN+1;
            count++;
        }
        int[] answer = new int[count+1];
        int i = 0;
        copyN = n;
        while (copyN != 1) {
            answer[i] = copyN;
            if (copyN % 2 == 0)
                copyN /= 2;
            else
                copyN = 3*copyN+1;
            i++;
        }
        answer[i] = 1;
        return answer;
    }
}