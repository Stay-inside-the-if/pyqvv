class Solution {
    public int solution(int slice, int n) {
        for (int i = 1; ; i++) {
            if ((slice * i / n) > 0)
                return i;
        }
    }
}