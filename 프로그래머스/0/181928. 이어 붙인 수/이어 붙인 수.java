class Solution {
    public int solution(int[] num_list) {
        String str_odd = "";
        String str_even = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                str_odd += Integer.toString(num_list[i]);
            } else {
                str_even += Integer.toString(num_list[i]);
            }
        }
        
        int answer = Integer.parseInt(str_odd) + Integer.parseInt(str_even);
        
        return answer;
    }
}