public class Shape {
  String Color="Green";
  public void displayColor(){
    System.out.println(Color);
  }
}
class Circle extends Shape{
double radius=24.45;
public void calculateArea(){
double area=2*(22/7)*radius;
System.out.println(area);
}
}
class Rectangle extends Shape{
  double l=25.23;
  double w=21.14;
  public void calculateArear(){
    double arear=2*(l+w);
    System.out.println(arear);
  }
}
class Main{
  public static void main(String[] args) {
    Circle c=new Circle();
    c.displayColor();
    c.calculateArea();
    Rectangle r=new Rectangle();
    r.displayColor();
    r.calculateArear();
}}