import static java.lang.Math.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    private static int getNoOfDigits(long x)
    {
        return (int)floor((log10(x) / log10(2)) + 1); // no of digits
    }

    public static void main(String... args) throws Exception
    {
        int n;
        long x, d, q, count;
        StringBuilder output = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        while(n-- != 0)
        {
            x = Long.parseLong(br.readLine());
            count = 0;
            for(d = 1 ; d <= x ; d++)
            {
                q = x/d;
                if(q <= d)
                    count++;
                else if(getNoOfDigits(q) <= getNoOfDigits(d)) // even if q > d still they may have same no of bits, eg: (q,d:8,10), (q,d:18,22)
                    count++;
            }
            output.append(count + "\n");
        }
        System.out.print(output);
        br.close();
    }
}