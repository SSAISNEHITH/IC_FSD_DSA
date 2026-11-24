interface RemoteControl{
abstract void turnOn();
default void batteryStatus(){
  System.out.println("Remote battery is 100%");
}
}
class TV implements RemoteControl{
  @Override 
  public void turnOn(){
    System.out.println("TV is turned ON");
  }
}
class AC implements RemoteControl{
  @Override 
  public void turnOn(){
    System.out.println("AC is turned ON");
  }
}
class Main{
  public static void main(String[] args) {
    RemoteControl r1 = new TV();
    r1.batteryStatus();
    r1.turnOn();
    RemoteControl r2 = new AC();
    r2.batteryStatus();
    r2.turnOn();
  }
}
