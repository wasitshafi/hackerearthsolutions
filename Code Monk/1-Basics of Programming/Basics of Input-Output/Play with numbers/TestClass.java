/**
    @author  wasitshafi
    @since   17-01-2020 
*/
import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        int n, q, l, r;
        long arr[];
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        
        n = scan.nextInt();
        q = scan.nextInt();
        
        arr = new long [n];
        arr[0] = scan.nextLong();
        for(int i = 1 ; i < n ; i++) arr[i] = arr[i - 1] + scan.nextLong();  // prefix sum
        
        while(q-- != 0)
        {
            l = scan.nextInt() - 1;
            r = scan.nextInt() - 1;

            if(l == 0)
                sb.append((arr[r] / (r - l + 1)) + "\n");
            else
                sb.append(((arr[r] - arr[l - 1]) / (r - l + 1)) + "\n");
        }
        System.out.println(sb);
        scan.close();
    }
}