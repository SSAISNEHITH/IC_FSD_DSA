public class Shape {
  void draw(){
    System.out.println("Drawing a shape");
  }
}
class Circle extends Shape{
  @Override
  void draw(){
    System.out.println("Drawing a Circle");
  }
}
class Square extends Shape{
  @Override
  void draw(){
    System.out.println("Drawing a Square");
  }
}
class Main{
  public static void main(String[] args) {
    Shape s=new Circle();
    s.draw();
    s=new Square();
    s.draw();
  }
}