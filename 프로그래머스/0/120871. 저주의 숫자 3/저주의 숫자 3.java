class Solution {
    public int solution(int n) {
        int[] intArray = new int[100];
        int i = 0;
        int num = 1;
        
        while (i < 100) {
            if ((num % 3 != 0) && !(String.valueOf(num).contains("3"))) {
                intArray[i++] = num; 
            }
            num++;
        }
        return intArray[n-1];
    }
}