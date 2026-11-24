interface Printable {
  abstract void printDocument();
}
interface Scannable {
  abstract void scanDocument();
}
class SmartPrinter implements Printable, Scannable{
  @Override
  public void printDocument(){
    System.out.println("Printing document..");
  }
  @Override
  public void scanDocument(){
    System.out.println("Scanning document...");
  }
} 
class Main{
  public static void main(String[] args) {
  SmartPrinter sp =new SmartPrinter();
  sp.printDocument();
  sp.scanDocument();
  }
}