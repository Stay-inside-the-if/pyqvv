class Solution {
    public int solution(int a, int b) {
        String strNum1 = Integer.toString(a) + Integer.toString(b);
        int num1 = Integer.parseInt(strNum1);
        
        String strNum2 = Integer.toString(b) + Integer.toString(a);
        int num2 = Integer.parseInt(strNum2);
        
        if (num1 > num2)
            return num1;
        else 
            return num2;
    }
}