import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] intArr = new int[] {a, b, c, d};
        Arrays.sort(intArr);
        
        a = intArr[0];
        b = intArr[1];
        c = intArr[2];
        d = intArr[3];
        
        if (a!=b)
            if (b!=c)
                if (c!=d)
                    answer=a;
                else
                    answer=a*b;
            else
                if (c==d)
                    answer=(10*b+a)*(10*b+a);
                else
                    answer=a*d;
        else
            if (b==c)
                if (c==d)
                    answer=1111*a;
                else
                    answer=(10*c+d)*(10*c+d);
            else
                if (c==d)
                    answer=(b+c)*(c-b);
                else
                    answer=c*d;
                   
        return answer;
    }
}