class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (int i = 0; i < dic.length; i++) {
            
            int j = 0;
            for (j = 0; j < spell.length; j++) {
                if (!dic[i].contains(spell[j])) {
                    break;
                }
                else {
                    String temp = dic[i].replace(spell[j], "");
                    if ((dic[i].length() - temp.length()) > 1)
                        break;
                }
            }
            if (j == spell.length) {
                answer = 1;
            }
        }
        return answer;
    }
}