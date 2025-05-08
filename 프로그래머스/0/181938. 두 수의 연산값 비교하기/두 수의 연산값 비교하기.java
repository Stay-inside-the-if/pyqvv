class Solution {
    public int solution(int a, int b) {
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        int sum = Integer.parseInt(strA+strB);
        
        if (sum > (2*a*b))
            return sum;
        return (2*a*b);
    }
}