class Car {
  private int speed=100;
  public void getter(){
    System.out.println(speed);

  }
  public void setter(int c){
    speed=c;
  }
}
class Main{
  public static void main(String[] args) {
      Car c=new Car();
      c.getter();
      c.setter(120);
      c.getter();
    }
}