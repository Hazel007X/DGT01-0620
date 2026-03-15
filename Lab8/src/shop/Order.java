package shop;

public class Order {
    private Customer customer;
    private Product product;

    public void setCustomer(Customer c) {
        customer = c;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setProduct(Product p) {
        product = p;
    }

    public Product getProduct() {
        return product;
    }
}
