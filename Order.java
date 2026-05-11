public class Order {
    private double totalAmount;
    private String customerType; // Ví dụ: "VIP" hoặc "NORMAL"

    public Order(double totalAmount, String customerType) {
        this.totalAmount = totalAmount;
        this.customerType = customerType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerType() {
        return customerType;
    }
}