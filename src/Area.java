//Find Area of circle
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area ,r;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Radius");
        r=scanner.nextDouble();
        area=3.14*r*r;
        System.out.println("Area of circle:");
        System.out.println(area);
    }
}
