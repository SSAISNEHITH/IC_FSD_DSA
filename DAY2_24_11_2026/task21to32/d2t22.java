/*Task22 – Abstract Class: Bank Account
Create an abstract class named BankAccount with an abstract method calculateInterest() (returning double) and a concrete method displayAccountType() 
that prints "Bank Account Details".
Task: Create a subclass SavingsAccount that extends BankAccount, adds a balance (double) field, and overrides calculateInterest() to return balance * 0.05.
Test: Instantiate a SavingsAccount object, set its balance to 50000, call displayAccountType(), and print the calculated interest.
*/


abstract class Ba{
  abstract double calculateIntrest();
  void dat(){
    System.out.println("Bank Account Details");
  }
}class Sa extends Ba{
  double bal;
  @Override
  public double calculateIntrest(){
    return bal*0.05;
  }
}
public class d2t22 {
  public static void main(String[] args) {
      Sa s=new Sa();
      s.bal=50000.0;
      s.dat();
      System.out.println( s.calculateIntrest());
  }
}