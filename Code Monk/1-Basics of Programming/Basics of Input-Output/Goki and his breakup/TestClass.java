/**
    @author  wasitshafi
    @since   06-01-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int n, x;
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        x = Integer.parseInt(br.readLine());
        
        while(n-- != 0)
        {
            if(Integer.parseInt(br.readLine()) >= x)
                sb.append("YES");
            else
                sb.append("NO");
            if(n != 0) sb.append("\n");
        }
        System.out.println(sb);
        
        br.close();
    }
}