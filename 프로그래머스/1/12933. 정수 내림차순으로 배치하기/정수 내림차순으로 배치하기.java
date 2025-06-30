import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public long solution(long n) {
        String strN = String.valueOf(n);
        ArrayList<Character> list = new ArrayList<>();
        
        for (int i = 0; i < strN.length(); i++) {
            list.add(strN.charAt(i));
        }
        Collections.sort(list);
        Collections.reverse(list); 
        
        strN = "";
        for (int i = 0; i < list.size(); i++) {
            strN += list.get(i);
        }
        
        long answer = Long.valueOf(strN);
        return answer;
    }
}