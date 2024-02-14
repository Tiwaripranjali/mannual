public class Type {
        public static void main(String[] args)  {
            int a=7,b=2;
            double c;
            c =  a / b * 3.5;
            System.out.println( c );
            long p = 10;
           // int q = p ; not acceptable
            int q = 0;
            int p1= (int) q;
            boolean x = true;  // valid
           // boolean y = 1;    // invalid int
           boolean z = true;     // invalid.

        }
    }

