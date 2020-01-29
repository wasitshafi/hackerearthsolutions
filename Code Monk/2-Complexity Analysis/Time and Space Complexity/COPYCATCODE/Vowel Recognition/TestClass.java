/**
    @author  wasitshafi
    @since   27-01-2020
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int n;
        String s;
        long count = 0, len;
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        while(n-- != 0)
        {
            count = 0;
            s = br.readLine();
            len = s.length();
            for(int i = 0 ; i < len ; i++)
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
                count += (len - i) * (i + 1);
            sb.append(count + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}