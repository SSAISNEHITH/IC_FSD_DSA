public class BankAccount {
  private String achld="sai";
  private double bal=25400.21;
  public void setter(double balance){
    if((balance<=0)){
      System.out.println("Invalid Amount");
    }
  }
  public void getter(){
    System.out.println(bal);
  }
  public void deposite(double amount){
    bal+=amount;
  }
  public void withdraw(double amount){
    if(bal<=0.0){
      System.out.println("INVALID BALANCE");
    }
    else if(bal<amount){
      System.out.println("Not Sufficent balance");
    }else{
      bal-=amount;
    }
  }
}
class Main{
  public static void main(String[] args) {
      BankAccount b=new BankAccount();
      b.setter(-123.23);
      b.getter();
      b.withdraw(50000.23);
  }
}
