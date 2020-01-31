/**
    @author  wasitshafi
    @since   30-01-202
*/
import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        short tc;
        int friends, chocolates;
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        
        tc = scan.nextShort();
        while( tc-- != 0)
        {
            friends = scan.nextInt();
            chocolates = scan.nextInt();
            if(chocolates % friends == 0) 
                output.append("Yes\n");
            else
                output.append("No\n");
        }
        System.out.println(output);
        scan.close();
    }
}