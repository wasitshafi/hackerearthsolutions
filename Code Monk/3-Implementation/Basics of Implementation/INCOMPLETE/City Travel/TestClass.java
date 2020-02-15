/**
    @author  wasitshafi
    @since   14-02-2020 
*/
import java.util.Scanner;
import java.util.HashMap;

class TestClass
{
    public static void main(String... args)
    {
        int s, x, n, t, y, day = 1, totalDays = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        s = scan.nextInt();
        x = scan.nextInt();
        n = scan.nextInt();
        while(n-- != 0)
        {
            t = scan.nextInt();
            y = scan.nextInt();
            m.put(t,y);
        }

        day = 1;
        while(s > 0)
        {
            if(m.containsKey(day))
                s = s - m.get(day);
            else
                s = s - x;

            totalDays++;
            day++;
        }
        System.out.println(totalDays);
        scan.close();
    }
}