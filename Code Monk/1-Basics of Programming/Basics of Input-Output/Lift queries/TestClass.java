 //initially i was using "System.out.println("A/B");" instead of StringBuilder() that time exection 
 // was 6.4218 sec now its 3.62079 sec.
import java.util.Scanner;
class TestClass
{
    public static void main(String args[])
    {
        int n, floor, upperLift = 7, lowerLift = 0;
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        n = scan.nextInt();
        while(n-- != 0)
        {
            floor = scan.nextInt();
            if(Math.abs(lowerLift - floor) <= Math.abs(upperLift - floor))
            {    
                sb.append("A\n");
                lowerLift = floor;
            }
            else
            {
                sb.append("B\n");
                upperLift = floor;
            }
        }
        System.out.println(sb.toString());
        scan.close();
    }
}