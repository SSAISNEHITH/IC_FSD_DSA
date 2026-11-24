/*Create an abstract class named Delivery with a concrete method acceptOrder() that prints "Delivery order accepted" and an abstract method deliverProduct().
Task: Create two subclasses extending Delivery:
FoodDelivery overriding deliverProduct() to print "Food order delivered to customer".
ParcelDelivery overriding deliverProduct() to print "Parcel delivered successfully".
Test: In a Main class, create one FoodDelivery object and one ParcelDelivery object, and call acceptOrder() and deliverProduct() on each.
*/
abstract class  Delivery{
  void acceptOrder(){
    System.out.println("Delivery order accepted");
  }
  abstract void  deliverProduct();
}
class FoodDelivery extends Delivery{
  @Override 
  public void deliverProduct(){
    System.out.println("Food order delivered to customer");
  }}
  class ParcelDelivery extends Delivery{
    @Override 
  public void deliverProduct(){
    System.out.println("Parcel delivered successfully");
  }
}


public class d2t24 {
  public static void main(String[] args) {
  FoodDelivery fd =new FoodDelivery();
  fd.acceptOrder();
  fd.deliverProduct();
  ParcelDelivery pd =new ParcelDelivery();
  pd.acceptOrder();
  pd.deliverProduct();
}
}