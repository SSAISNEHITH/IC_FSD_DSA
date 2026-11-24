public class Book {
  private String title ;
  private double price ;
  Book(){
    this.title="Unknown";
    this.price=0.0;
  }
  Book(String title){
    this.title = title;
  }
  Book(String title, double price){
      this.title=title;
      this.price=price;
  }
  void display(){
System.out.println("Title="+title+"\nPrice="+price);
  }
}
class Main{
  public static void main(String[] args) {
    Book b=new Book();
    b.display();
    Book b1=new Book("sai");
    b1.display();
    Book b2=new Book("pranay",450);
    b2.display();
  }
}
