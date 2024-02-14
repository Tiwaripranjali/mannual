//Comaparison and logical
import java.util.Scanner;

public class logop {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        boolean d=a<b;
        boolean e=a>b;
        boolean f=b>=c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        boolean x=(a>b&&a>c);// a is greater
        boolean y=(a>b||a>c);// returns trur if either one of the expression is true
        boolean z= !(a>b);//Logical not
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
