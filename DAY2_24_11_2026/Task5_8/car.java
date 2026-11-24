public class car {
  String brand;
  int year;
  car(){
    this.brand = "Toyota";
    this.year = 2024;
  }
  void displayDetails(){
    System.out.println("Brand="+brand+"\nYear="+year);
  }
}
class Main{
  public static void main(String[] args) {
    car object = new car();
    object.displayDetails();
  }
}