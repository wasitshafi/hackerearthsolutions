import static java.lang.System.out;
import static java.lang.Math.min;
import static java.lang.Math.max;
import java.util.Scanner;
 
public class TestClass
{
    public static void main(String... args)
    {
        int n, tc, greenBaloonCost, purpleBaloonCost, greenBaloonCount, purpleBaloonCount, questionFirstCount, questionSecondCount;
        Scanner scan = new Scanner(System.in);
    
        tc = scan.nextInt();    
        while(tc-- != 0)
        {
            greenBaloonCost =  scan.nextInt();
            purpleBaloonCost = scan.nextInt();
            questionFirstCount  = questionSecondCount = 0;
            n = scan.nextInt();
            while(n-- != 0)
            {
                if(scan.nextInt() == 1) questionFirstCount++;
                if(scan.nextInt() == 1) questionSecondCount++;
            }
            out.println(max(questionFirstCount, questionSecondCount) * min(greenBaloonCost, purpleBaloonCost) + min(questionFirstCount, questionSecondCount) * max(greenBaloonCost, purpleBaloonCost));
        }
        scan.close();
    }
}