public class Payment {
  void pay(double amount){
    System.out.println("Processing generic payment of ₹" + amount);
  }
}
class CreditCard extends Payment{
void pay(double amount){
    System.out.println("Paid ₹" + amount + " via Credit Card");
  }
}
class UPI extends Payment{
void pay(double amount){
    System.out.println("Paid ₹" + amount + " via UPI");
  }
}
class Main {
  public static void main(String[] args) {
    Payment[] payments = { new CreditCard(), new UPI() };
    for(int i=0;i<payments.length;i++){
      payments[i].pay(500.0);
    }
  }
}