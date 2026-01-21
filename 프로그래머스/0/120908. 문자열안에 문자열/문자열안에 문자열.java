class Solution {
    public int solution(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                if (i+str2.length()<=str1.length()) {
                    if (str1.substring(i, i+str2.length()).equals(str2))
                        return 1;
                }
            }
        }
        return 2;
    }
}