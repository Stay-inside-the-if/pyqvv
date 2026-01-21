class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] array = binomial.split(" ");
        
        if (array[1].equals("+"))
            answer = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
        else if (array[1].equals("-"))
            answer = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
        else
            answer = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);

        return answer;
    }
}