public class Person {
  String name="sai";
  public void displayPerson(){
    System.out.println(name);
  }
}
class Employee extends Person{
int empId=23;
public void displayEmp(){
  System.out.println(empId);
  displayPerson();
}
}
class Manager extends Employee{
  String department="HR";
  public void displayManager(){
    System.out.println(department);
    displayEmp();
    displayPerson();
  }
}
class Main{
  public static void main(String[] args) {
    Manager m=new Manager();
    m.displayManager();
  }
}