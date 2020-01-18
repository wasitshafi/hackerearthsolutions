/**
    @author  wasitshafi
    @since   17-01-2020 
*/
import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        int n, sum = 0;
        StringBuilder sb = new StringBuilder("");
        StringBuilder s = new StringBuilder("");
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            s.append(scan.next());
            if(i < n / 2)
                sb.append(s.charAt(0));
            else
                sb.append(s.charAt(s.length() - 1));
            s.setLength(0);
        }
        
        for(int i = 0 ; i < sb.length() ; i++)
            if(i % 2 == 0)
                sum = sum + (int)(sb.charAt(i) - '0');
            else
                sum = sum - (int)(sb.charAt(i) - '0');
        
        if(sum % 11 == 0)
            System.out.println("OUI");
        else
            System.out.println("NON");

        scan.close();
    }
}