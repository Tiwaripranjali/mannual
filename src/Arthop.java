import java.util.Scanner;

public class Arthop {
    public static void main(String[] args) {
        Double n1,n2;
        Double r1,r2,r3,r4,r5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        n1=sc.nextDouble();
        n2= sc.nextDouble();
        r1=n1+n2;
        r2=n1-n2;
        r3=n1*n2;
        r4=n1/n2;
        r5=n1%n2;
        System.out.println("Addition"+r1);
        System.out.println("Substraction"+r2);
        System.out.println("Multiplication"+r3);
        System.out.println("Division"+r4);
        System.out.println("Modulus"+r5);
    }
}
