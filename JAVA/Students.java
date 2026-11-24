public class Students {
  private String name ="sai";
  private int rollNumber =23;
  public void getName(){
    System.out.println(name);
  }
  public void setName(String Name){
    name=Name;
  }
  public void getRollNumber(){
    System.out.println(rollNumber);
  }
  public void setRollNumber(int roll){
    rollNumber=roll;
  }
}
class Main{
  public static void main(String[] args) {
  Students s=new Students();
  s.getName();
  s.getRollNumber();
  s.setName("saise");
  s.setRollNumber(245);
  s.getName();
  s.getRollNumber();
  }
}