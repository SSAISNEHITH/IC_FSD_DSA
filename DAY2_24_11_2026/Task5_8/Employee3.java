abstract class Employee3 {
  String name;
  Employee3(String name){
    this.name=name;
  };
  void showName(){
    System.out.println("Employee: " + name);
  }
  abstract void calculateSalary();
}
class FullTimeEmployee extends Employee3{
  double monthlySalary;
  FullTimeEmployee(String name,double monthlySalary){
    this.monthlySalary=monthlySalary;
    super(name);
  }
  @Override
  public void calculateSalary(){
    System.out.println("Monthly Salary: ₹" + monthlySalary);
  }
}
class Main{
  public static void main(String[] args) {
    FullTimeEmployee fte =new FullTimeEmployee("sai",54203.23);
    
    fte.showName();
    fte.calculateSalary();
  }
}