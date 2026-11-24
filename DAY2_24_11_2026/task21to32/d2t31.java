class Product {
    String productName;
    int quantity;
    double price;

    public Product() {
        this.productName = "Unknown";
        this.quantity = 1;
        this.price = 100.0;
    }

    public Product(String productName) {
        this.productName = productName;
        this.quantity = 1;
        this.price = 100.0;
    }

    public Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void calculateTotal() {
        System.out.println("Total Price: ₹" + (quantity * price));
    }
}

public class d2t31 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Notebook");
        Product p3 = new Product("Mechanical Keyboard", 2, 2499.0);

        p1.calculateTotal();
        p2.calculateTotal();
        p3.calculateTotal();
    }
}