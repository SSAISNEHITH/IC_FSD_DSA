
import java.util.Scanner;

public class WORKLOAD1_2 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter Your First & Second Number=");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("First Num="+a+"\nSecond Num="+b);
      System.out.println("After Swapping");
      a=a+b;
      b=a-b;
      a=b-a;
      System.out.println("first num="+a+"Second num="+b);
  }
}
