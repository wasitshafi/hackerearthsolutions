/**
    @author  wasitshafi
    @since   17-01-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class TestClass
{
    public static void main(String... args) throws Exception
    {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        s = br.readLine();
        if(s.charAt(s.length() - 1) == '0') System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }
}