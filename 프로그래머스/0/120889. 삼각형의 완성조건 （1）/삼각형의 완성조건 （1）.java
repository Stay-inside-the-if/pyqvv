class Solution {
    public int solution(int[] sides) {
        int maxSide = sides[0];
        int maxSideIndex = 0;
        for (int i = 1; i < 3; i++)
            if (maxSide < sides[i]) {
                maxSide = sides[i];
                maxSideIndex = i;
            }
        int sideSum = 0;
        for (int i = 0; i < 3; i++)
            if (i != maxSideIndex) {
                sideSum += sides[i];
            }
        
        if (sideSum > maxSide)
            return 1;
        else
            return 2;
    }
}