class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] intArray = new int[included.length];
        
        int temp = a;
        for (int i = 0; i < included.length; i++) {
            intArray[i] = temp;
            temp += d;
        }
        
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true)
                answer += intArray[i];
        }       
        
        return answer;
    }
}