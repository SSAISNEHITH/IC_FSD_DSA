public class REctangle {
  double length;
  double width;
  REctangle(){
    this.length=1.0;
    this.width = 1.0;
  }
  REctangle(double side){
    this.length=side;
    this.width = side;
  }
  REctangle(double length, double width){
    this.length=length;
    this.width = width;
  }
void calculateArea(){
  System.out.println("Area: " + (length * width));
}
}
class Main{
  public static void main(String[] args) {
    REctangle r1 = new REctangle();
    r1.calculateArea();
    REctangle r2 = new REctangle(58.0);
    r2.calculateArea();
    REctangle r3 = new REctangle(47.0, 69.0);
    r3.calculateArea();
  }
}
/*Task19

Create a class named Rectangle with fields length (double) and width (double).

Task: Write three overloaded constructors:
Rectangle() — sets length = 1.0 and width = 1.0.
Rectangle(double side) — sets both length and width to side (for a square).
Rectangle(double length, double width) — sets length and width to the given values.
Add a calculateArea() method that prints "Area: " + (length * width).
Test: Instantiate three Rectangle objects using all three constructors and call calculateArea() on each.*/
