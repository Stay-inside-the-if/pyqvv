class Solution {
    public int solution(int[] num_list) {
        int list_size = num_list.length;
        
        int sum = 0;
        int multiple = 1;
        for (int i = 0; i < list_size; i++) {
            sum += num_list[i];
            multiple *= num_list[i];
        }
        
        int answer;
        if (multiple > sum*sum)
            answer = 0;
        else
            answer = 1;
        
        return answer;
    }
}