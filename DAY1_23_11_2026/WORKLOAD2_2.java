import java.util.Scanner;
public class WORKLOAD2_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Different Number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
    //Comparisiion
    if((a>b) && (a>c)){
        System.out.println("Number 1"+a+" Is Biggest Number");
    }
    else if((b>a)&&(b>c)){
        System.out.println("Number 2"+b+"Is Biggest Number");
    }
    else if((c>a)&&(c>b)){
        System.out.println("Number 3 "+c+"Is greatest Number");
    }else{
        System.out.println("NOt Declarable");
    }
    }
}