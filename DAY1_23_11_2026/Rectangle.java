public class Rectangle {
  private double length=45.24;
  private double width=23.42;
  public void getter(){
    System.out.println("Length="+length+"width="+width);
  }
  public void setter(double l,double w){
    if(l<=0){
      System.out.println("Negative length");
    }else{
      length=l;
    }
    if(w<=0){
      System.out.println("Negative Width");
    }else{
      width=w;
    }
  }
  public void calculateArea(){
    double area=length*width;
    System.out.println("area="+area);
  }
  public void calculatePerimeter(){
    double pre=2*(length+width);
    System.out.println("Perimeter="+pre);
  }
}
class Main{
  public static void main(String[] args) {
    Rectangle r=new Rectangle();
    r.getter();
    r.setter(-42.23,-25.23);
    r.getter();
    r.calculateArea();
    r.calculatePerimeter();
  }}
