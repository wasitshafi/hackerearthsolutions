/**
    @author  wasitshafi
    @since   16-01-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int n;
        StringBuilder ladder = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        ladder.append("*   *\n*   *\n");
        while(n-- != 0)ladder.append("*****\n*   *\n*   *\n");
        System.out.print(ladder);
        br.close();
    }
}