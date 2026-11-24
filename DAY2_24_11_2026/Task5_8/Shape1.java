abstract class Shape1 {
  abstract double calculateArea();
  void displayMessage(){
    System.out.println("Calculating area of the shape...");
  }
}
class Circle extends Shape1{
  double radius;
  @Override
  double calculateArea(){
    return 3.14 * radius * radius;
  }
}
class Main{
  public static void main(String[] args) {
    Circle c= new Circle();
    c.radius=42.3;
    
    c.displayMessage();
    System.out.println(c.calculateArea());
  }
}