abstract class Appliance {
  void plugin(){
    System.out.println("Appliance plugged into power");
  }
  abstract void  operate();
}
class Fan extends Appliance {
  @Override
  public void  operate(){
    System.out.println("Fan is spinning at high speed");
  }
}
class WashingMachine extends Appliance{
  @Override 
  public void  operate(){
    System.out.println("Washing machine is washing clothes");
  }
}
class Main{
  public static void main(String[] args) {
    Fan f=new Fan();
    WashingMachine wm =new WashingMachine();
    f.plugin();
    wm.plugin();
    f.operate();
    wm.operate();
  }
}