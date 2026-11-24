import java.util.Scanner;

public class WORKLOAD2_1 {
  public static void main(String[] args) {
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any year=");
    a=sc.nextInt();
    sc.close();
    if(a%2==0){
      System.out.println("Give is a even year/number");
    }else{
      System.out.println("Given is odd year/number");
    }
    //leap year
    if(a%4==0){
      System.out.println("Given year is a leap year");
    }else{
      System.out.println("Given year is a non leap year");
    }
}
}