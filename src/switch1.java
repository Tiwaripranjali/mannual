import java.util.Scanner;
public class switch1 {

    public static void main(String[] args) {
        int dayOfWeek;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter choice");
        dayOfWeek = scan.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");

            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

