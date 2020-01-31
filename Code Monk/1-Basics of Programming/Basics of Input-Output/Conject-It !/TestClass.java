/**
    @author  wasitshafi
    @since   30-01-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int n;
        StringBuilder output = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        while(n-- != 0) output.append("YES\n"); // we know it will always truns out to be 1
        System.out.print(output);
        
        br.close();
    }
}