/**
    @author  wasitshafi
    @since   23-01-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        String s[] = (br.readLine()).split(" ");
        int n = Integer.valueOf(s[1]);
        
        for(int i = 0 ; i < s[0].length() ; i++)
        {
            if(s[0].charAt(i) != '9' && n != 0)
            {
                ans.append("9");
                n--;
            }
            else
                ans.append(s[0].charAt(i));
        }
        System.out.println(ans);
        br.close();
    }
}