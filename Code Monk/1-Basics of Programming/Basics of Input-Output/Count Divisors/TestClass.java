import java.util.Scanner;
class TestClass
{
    public static void main(String... args)
    {
        int l, r, k, count = 0;
        Scanner scan = new Scanner(System.in);
        
        l = scan.nextInt();
        r = scan.nextInt();
        k = scan.nextInt();
        for(int i = l ; i <= r ; i++) if(i % k == 0) count++;
        System.out.println(count);
        scan.close();
    }
}