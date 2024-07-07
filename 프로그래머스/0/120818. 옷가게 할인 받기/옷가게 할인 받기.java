class Solution {
    public int solution(int price) {
        double finalPrice = price;

        if (price >= 500000) {
            finalPrice = price * 0.8; 
        } else if (price >= 300000) {
            finalPrice = price * 0.9; 
        } else if (price >= 100000) {
            finalPrice = price * 0.95; 
        }

        return (int) finalPrice;
    }
}