/*Simple Calculation using Scanner,and switch cases*/
import java.util.Scanner;
class Simple_Calculation{
  public static void main(String [] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Number one by one=");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Enter Your Option 1.Add, 2.Sub, 3.Mul, 4.Div =");
    int opt=sc.nextInt();
    switch (opt){
      case 1:
        System.out.println(a+b);
        break;
      case 2:
        System.out.println(a-b);
        break;
      case 3:
        System.out.println(a*b);
        break;
      case 4:
          if(b!=0)
          {  System.out.println(a/b);
          }
        else{
          System.out.println("Division can't be performed");}
          break;
      default:
        System.out.println("Enter Valid Number from giveen Options");
    }
  }
}