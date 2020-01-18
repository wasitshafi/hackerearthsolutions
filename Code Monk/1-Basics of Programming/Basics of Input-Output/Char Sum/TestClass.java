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
        String s;
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        s = br.readLine();
        for(int i = 0 ; i < s.length() ; i++) sum += (int)(s.charAt(i) - 'a' + 1);
        System.out.println(sum);
        br.close();
    }
}