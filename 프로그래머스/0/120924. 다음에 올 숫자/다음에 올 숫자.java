class Solution {
    public int solution(int[] common) {
        int lastNum = common[common.length - 1];
        int num = 0;
        
        for (int i = 0; ;i++) {
            if ((common[i] != 0) && (common[i+1] != 0) && (common[i+2] != 0)) {
                num = common[i+1] / common[i];
                
                if ((num == (common[i+2] / common[i+1])) && ((common[i+1] % common[i]) == 0)) {
                    return (lastNum * num);
                }  
                else {
                    num = common[i+1] - common[i];
                    return (lastNum + num);
                }
            }
            else {
                num = common[i+1] - common[i];
                return (lastNum + num);
            }
        }      
    }
}