public class Calculator {
  void add(int a, int b){
    System.out.println(a+b);
  }
  void add(int a, int b, int c){
    System.out.println(a+b+c);
  }
}
class Main {
  public static void main(String[] args) {
    Calculator c=new Calculator();
    c.add(12,14);
    c.add(15,45,78);
  }
}