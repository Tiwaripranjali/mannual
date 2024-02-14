import java.util.Scanner;

public class primel {
    public static void main (String[] args)
    {
        int i =0;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter end number: ");
        num =sc.nextInt();
        for (i = 1; i<num; i++)
        {
                if(i%num==0)
                {
                    i++;
                }
            System.out.println(i);
            }
    }
}
