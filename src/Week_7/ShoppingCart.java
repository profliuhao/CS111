package Week_7;

import java.util.ArrayList;

public class ShoppingCart {


    public static void main(String[] args) {

        Book mybook1 = new Book(156, "Harry Portter part 1", 15);
        Book mybook2 = new Book(67, "Harry Portter part 2", 16);
        Book mybook3 = new Book(156, "Harry Portter part 1", 18);
        Book mybook4 = new Book(189, "Harry Portter part 3",20);

        Book[]  mybooks = new Book[4];
        mybooks[0] = mybook1;
        mybooks[1] = mybook2;
        mybooks[2] = mybook3;
        mybooks[3] = mybook4;

        ShoppingCart cart = new ShoppingCart();
        double cost = cart.calculateTotalCost(mybooks);
        System.out.println("cost = " + cost);


        double scost = cart.calculateTotalCostSimple(mybooks);
        System.out.println("Simple cost = " + scost);


    }
    public double calculateTotalCost(Book[] items) {
        double total = 0.0;
        for (Book item : items) {
            total += item.getPrice();
        }

        double tax = total * 0.08;
        total += tax;

        if (total > 100.0) {
            total -= 10.0;
        }

        return total;
    }

    public double calculateTotalCostSimple(Book[] items) {
        double subtotal = calculateSubtotal(items);
        double tax = calculateTax(subtotal);
        double total = applyDiscount(subtotal + tax);

        return total;
    }

    private double calculateSubtotal(Book[] items) {
        double subtotal = 0.0;
        for (Book item : items) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

    private double calculateTax(double subtotal) {
        return subtotal * 0.08;
    }

    private double applyDiscount(double total) {
        if (total > 100.0) {
            return total - 10.0;
        } else {
            return total;
        }
    }
}

