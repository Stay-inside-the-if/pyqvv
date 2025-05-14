class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        
        while (chicken / 10 != 0) {
            coupon = chicken;           // 치킨 시켜 받은 쿠폰 수
            answer += (coupon / 10);    // 쿠폰으로 시킨 치킨 수
            coupon = (coupon / 10) + (coupon % 10);     // 남은 쿠폰 + 쿠폰으로 시킨 치킨으로 받은 쿠폰 수
            chicken = coupon;
        }
        
        return answer;
    }
}