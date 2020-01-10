import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        Byte n;
        int fact = 1;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextByte();
        while(n != 1) fact = fact * n--;
        System.out.println(fact);
        scan.close();
    }
}