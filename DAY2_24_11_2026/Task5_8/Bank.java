public class Bank {
  public void getInterestRate(){
    double ir=0.0;
    System.out.println("Intrest rate="+ir);
  }
}
class SBI extends Bank{
  @Override
  public void getInterestRate(){
    double ir=6.5;
    System.out.println("Intrest rate="+ir);
  }
}
class HDFC extends Bank{
  @Override
public void getInterestRate(){
    double ir=7.0;
    System.out.println("Intrest rate="+ir);
  }
}
class Main{
  public static void main(String[] args) {
    SBI s=new SBI();
    s.getInterestRate();
    HDFC h=new HDFC();
    h.getInterestRate();
  }
}