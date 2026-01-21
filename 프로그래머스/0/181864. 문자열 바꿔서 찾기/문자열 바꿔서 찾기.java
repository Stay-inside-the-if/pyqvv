class Solution {
    public int solution(String myString, String pat) {
        String switchStr = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A')
                switchStr += "B";
            else
                switchStr += "A";
        }
        
        if (switchStr.contains(pat))
            return 1;
        else
            return 0;
    }
}