/**
    @author  wasitshafi
    @since   17-01-2020 
*/
import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        System.out.println(Math.max(a, Math.max(b, c)));
                        // or
        //System.out.println(a > b ? a > c ? a : c : b > c ? b : c);
        scan.close();
    }
}