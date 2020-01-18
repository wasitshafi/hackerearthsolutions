/**
    @author  wasitshafi
    @since   17-01-2020 
*/
import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        System.out.print((int)(Math.ceil(n / 5.0)));
        scan.close();
    }
}