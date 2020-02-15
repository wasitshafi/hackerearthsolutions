/**
    @author  wasitshafi
    @since   14-02-2020 
*/
import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        int t, c, n, i, sum = 0;
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");

        t = scan.nextInt();
        while(t-- != 0)
        {
            c = scan.nextInt();
            n = scan.nextInt();
            if(n * (n + 1) / 2 > c) // not possible
                output.append(c); 
            else
            {
                i = 1; 
                while(((i + n - 1) * ((i + n - 1) + 1) / 2) - ((i - 1) * ((i - 1) + 1) / 2) <= c) // using sum to n : n*(n + 1)/2
                {
                    sum = ((i + n - 1) * ((i + n - 1) + 1) / 2) - ((i - 1) * ((i - 1) + 1) / 2);
                    i++;
                }
                output.append(c - sum);
            }
            output.append("\n");
        }
        System.out.print(output);
        scan.close();
    }
}