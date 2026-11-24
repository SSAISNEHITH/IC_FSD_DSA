public class Student2 {
  String name;
  double marks;
  Student2(String name, double marks){
    this.name=name;
    this.marks=marks;
  };
  void showResult(){
    System.out.println("Name="+name+"\nMarks="+marks);
  }
}
class Main{
  public static void main(String[] args) {
      Student2 s1 =new Student2("sai",450 );
      s1.showResult();
      Student2 s2 =new Student2("saiii",4507 );
      s2.showResult();
  }
}