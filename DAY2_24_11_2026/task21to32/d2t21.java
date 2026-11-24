/*Task21 – Abstract Class: Vehicle
Create an abstract class named Vehicle with an abstract method startEngine() and a concrete method stopEngine() that prints "Vehicle engine stopped".
Task: Create a subclass Bike that extends Vehicle and overrides startEngine() to print "Bike engine started using self-start".
Test: In a Main class, instantiate a Bike object and call both startEngine() and stopEngine().
*/
abstract class Vehicle{
  abstract void startEngine();
  void stopEngine(){
    System.out.println("Vehicle engine stopped");
  }
}
class Bike extends Vehicle {
  @Override
  public void startEngine(){
    System.out.println("Bike engine started using self-start");
  }
}
class d2t21{
  public static void main(String[] args) {
    Bike b = new Bike();
    b.startEngine();
    b.stopEngine();
  }
}