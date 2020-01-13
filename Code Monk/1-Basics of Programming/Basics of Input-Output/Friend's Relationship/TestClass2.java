import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass2 
{
    public static void main(String... args) throws Exception
    {
        int t, n, i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        StringBuilder sbAsterisk = new StringBuilder("");
        
        t = Integer.parseInt(br.readLine());
        while(t-- != 0)
        {
            n = Integer.parseInt(br.readLine());
            for(i = 1 ; i <= n ; i++)
            {
                for(j = 1 ; j <= i ; j++) sbAsterisk.append("*");
                sb.append(sbAsterisk.toString());
                
                for(j = 1 ; j <= (n - i) * 2 ; j++) sb.append("#");// if u observe it form an AP from bottom to top where a = 0, d = 2, so use formula Tn = a+(n-1)*d;
                sb.append(sbAsterisk.toString() + "\n");
                sbAsterisk.setLength(0);
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}