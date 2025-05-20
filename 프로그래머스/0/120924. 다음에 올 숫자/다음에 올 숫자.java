class Solution {
    public int solution(int[] common) {
        int lastNum = common[common.length - 1];
        int num = 0;
        
        if ((common[0] != 0) && (common[1] != 0) && (common[2] != 0)) {
            num = common[1] / common[0];
            
            if (((common[1] % common[0]) == 0) && (num == (common[2] / common[1]))) {
                return lastNum * num;
            }
        }
        
        num = common[1] - common[0];
        return lastNum + num;
    }
}