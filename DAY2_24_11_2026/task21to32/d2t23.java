/*Task23 – Abstract Class: Payment
Create an abstract class named Payment with a field amount (double), a constructor Payment(double amount) to initialize it, 
a concrete method showAmount() that prints "Payment Amount: ₹" + amount, and an abstract method processPayment().

Task: Create a subclass UPIPayment that extends Payment, passes the amount to the parent constructor using super(amount), 
and overrides processPayment() to print "Payment processed successfully using UPI".

Test: Instantiate a UPIPayment object and call both showAmount() and processPayment().
*/
abstract class Pa{
  double a;
  Pa(double a){
    this.a=a;
  }
  void sa(){
    System.out.println("Payment Amount: ₹" + a);
  }
  abstract void pp();
}
class Upi extends Pa{
  Upi(double a){
  super(a);}
  @Override
  public void pp(){
    System.out.println("Payment processed successfully using UPI");
  }
}

public class d2t23 {
  public static void main(String[] args) {
    
  Upi u =new Upi(5000.0);
  u.sa();
  u.pp();
}}
