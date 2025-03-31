class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom3 = denom1*denom2;
        int number3 = numer1*denom2 + numer2*denom1;
        
        for(int i=number3; i!=0; i--) {
            if ((number3%i==0) && (denom3%i==0)) {
                number3 /= i;
                denom3 /= i;
            }
        }
        
        int[] answer = {number3, denom3};
        return answer;
    }
}