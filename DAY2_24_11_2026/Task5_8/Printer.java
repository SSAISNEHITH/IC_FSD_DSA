public class Printer {
  void print(String text){
    System.out.println("Text: " + text);
  }
  void print(int number){
    System.out.println("Integer: " + number);
  }
  void print(double decimal) {
    System.out.println("Decimal: " + decimal);
  }
}
class Main{
  public static void main(String[] args) {
    Printer p=new Printer();
    p.print("Sai Snehith");
    p.print(4509);
    p.print(45.26);
  }
}
