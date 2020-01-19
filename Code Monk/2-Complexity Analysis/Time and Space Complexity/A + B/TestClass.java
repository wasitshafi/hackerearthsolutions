/**
 * @author wasitshafi 
 * @since  19-01-2020
*/
import java.util.Scanner;
import java.math.BigInteger;

class TestClass
{
    public static void main(String... args)
    {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        while(scan.hasNext()) sb.append((scan.nextBigInteger()).add(scan.nextBigInteger()) + "\n");
        System.out.println(sb);
        scan.close();
    }
}