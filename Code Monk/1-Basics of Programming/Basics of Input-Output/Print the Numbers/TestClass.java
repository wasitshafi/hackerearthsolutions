import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        int n;
        StringBuilder sb = new StringBuilder("");
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        while(n-- != 0) sb.append(scan.nextInt() + " ");
        System.out.println(sb);
        
        scan.close();
    }
}