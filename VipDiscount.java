public class VipDiscount implements DiscountStrategy {
    
    @Override
    public double applyDiscount(double amount) {
        // CỐ TÌNH LỖI: Hardcode số 0.20 (20%) thay vì dùng Hằng số (Constant)
        // AI xịn sẽ nhắc nhở dev nên khai báo private static final double VIP_DISCOUNT_RATE = 0.20;
        return amount - (amount * 0.20); 
    }
}
