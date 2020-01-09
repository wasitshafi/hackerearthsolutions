import java.util.Scanner;
class TestClass
{
    public static void main(String... args)
    {
        int n, sum = 0;
        char lastTurn = 'p';
        
        n = (new Scanner(System.in)).nextInt();
        for (int i = 1 ; sum < n ; i ++)
        {
            sum += i;
            lastTurn = 'p';
            if(sum < n)
            {
                sum = sum + (i * 2);
                lastTurn = 'm';
            }
            else
                break;
        }
        if(lastTurn == 'p')
            System.out.println("Patlu");
        else
            System.out.println("Motu");
    }
}