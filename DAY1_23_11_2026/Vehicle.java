public class Vehicle {
  public String Brand="VENUE";
  public void getBrand(){
    System.out.println(Brand);
  }
  public void honk(){
    System.out.println("Beep! Beep!");
  }
}
    class Car extends Vehicle{
      String ModelName=this.Brand;
      public void displaydetails(){
        System.out.println("Brand="+ModelName);
        honk();
      }
    }
class Main{
  public static void main(String[] args) {
      Vehicle v=new Vehicle();
      v.getBrand();
      Car c=new Car();
      c.displaydetails();
  }
}