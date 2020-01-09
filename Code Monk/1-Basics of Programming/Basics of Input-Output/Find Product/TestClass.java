import java.util.Scanner;

class TestClass
{
    public static void main(String args[])
    {
        long n, ans = 1; // to avoid multiplication overflow either of the variable should be of type long or use casting
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        while(n-- != 0) ans = ans * scan.nextInt() % 1000000007; System.out.println(ans);
    
        scan.close();
    }
}