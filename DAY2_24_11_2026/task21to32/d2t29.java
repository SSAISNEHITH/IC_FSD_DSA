class Mobile {
    String brand;
    double price;

    public Mobile() {
        brand = "Samsung";
        price = 25000.0;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Price: ₹" + price);
    }
}

public class d2t29 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.displayDetails();
    }
}
