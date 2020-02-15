/**
    @author wasitshafi
    @since  02-02-2020 
*/
import java.util.Scanner;
import java.util.Arrays;

class TestClass
{
    public static void main(String... args)
    {
        int i, s, q, type, l, r, x, y, diff, arr[];
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");

        s = scan.nextInt();
        q = scan.nextInt();
        
        arr = new int[s];
        arr[0] = scan.nextInt();
        for(i = 1 ; i < s ; i++) arr[i] = arr[i - 1 ] + scan.nextInt(); // prefix sum
        
        while(q-- != 0)
        {
            type = scan.nextInt();
            if(type == 1)
            {
                x = scan.nextInt(); // its index location(Refer above Explanation)
                y = scan.nextInt(); // new Value
                
                if(x == 0)
                    diff = y - arr[0];
                else
                    diff = y - (arr[x] - arr[x - 1]);
                for(i = x ; i < s ; i++) arr[i] += diff; 
            }
            else
            {
                l = scan.nextInt();
                r = scan.nextInt();
                if(l == 0)
                    output.append(arr[r]);
                else
                    output.append(arr[r] - arr[l - 1]);
                output.append("\n");
            }
        }
        System.out.println(output);
    }
}