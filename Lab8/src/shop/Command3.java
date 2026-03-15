package shop;

import java.util.Scanner;

public class Command3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Customer c1 = new Customer();
        Product p1 = new Product();
        Order order1 = new Order();

        System.out.print("Enter your customer name: ");
        c1.setName(input.nextLine());

        System.out.print("Enter your discount percentage: ");
        c1.setDiscount(input.nextDouble());

        input.nextLine(); // clear buffer

        System.out.print("Enter an ordered product: ");
        p1.setName(input.nextLine());

        System.out.print("Enter the product price: ");
        p1.setPrice(input.nextDouble());

        order1.setCustomer(c1);
        order1.setProduct(p1);

        double finalPrice = order1.getProduct().getPrice() * (1 - order1.getCustomer().getDiscount() / 100);

        System.out.printf("%s orders %s with price %.2f Baht.\n", order1.getCustomer().getName(),order1.getProduct().getName(),finalPrice);

        input.close();
    }
}
