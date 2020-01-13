import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int t, n, i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        StringBuilder sbAsterisk = new StringBuilder("");
        StringBuilder sbNumber = new StringBuilder("");
        
        t = Integer.parseInt(br.readLine());
        while(t-- != 0)
        {
            n = Integer.parseInt(br.readLine());
            
            sbAsterisk.append("*");
            for(i = 1 ; i <= (n - 1) * 2 ; i++) sbNumber.append("#");
            for(i = 1 ; i <= n ; i++)
            {
                sb.append(sbAsterisk.toString() + sbNumber.toString() + sbAsterisk.toString() + "\n");
                sbAsterisk.append("*");
                if(sbNumber.length() >= 2) sbNumber.setLength(sbNumber.length() - 2);     
            }
            System.out.println(sb.toString());
            sb.setLength(0);
            sbAsterisk.setLength(0);
            sbNumber.setLength(0);            
        }
    }
}