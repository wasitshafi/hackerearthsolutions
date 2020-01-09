import java.util.Scanner;
import static java.lang.System.out;

public class TestClass
{
    public static void main(String... args)
    {
        boolean isPrime;
        int n;
        
        n = (new Scanner(System.in)).nextInt();
        for(int i = 2 ; i <= n ; i++)
        {
            isPrime = true;
            for(int j = 2 ; j * j <= i ; j++)
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            if(isPrime) out.print(i + " ");
        }
    }
}