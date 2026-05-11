public class OrderCalculatorService {

    public double calculateFinalPrice(Order order) {
        // CỐ TÌNH LỖI 1: Thiếu check null cho object 'order', dễ gây NullPointerException
        
        // CỐ TÌNH LỖI 2: So sánh String bằng toán tử "==" thay vì dùng phương thức .equals()
        if (order.getCustomerType() == "VIP") { 
            VipDiscount discount = new VipDiscount();
            return discount.applyDiscount(order.getTotalAmount());
        }
        
        return order.getTotalAmount();
    }
}