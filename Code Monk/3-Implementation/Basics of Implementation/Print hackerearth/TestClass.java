/**
    @author  wasitshafi
    @since   14-02-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        String s;
        int n, h, a, c, k, e, r, t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        h = a = c = k = e = r = t = h = 0;
        n = Integer.parseInt(br.readLine());
        
        s = br.readLine();
        for(int i = 0 ; i < n ; i++)
        {
            switch(s.charAt(i))
            {
                case 'h' : h++; break;
                case 'a' : a++; break;
                case 'c' : c++; break;
                case 'k' : k++; break;
                case 'e' : e++; break;
                case 'r' : r++; break;
                case 't' : t++; break;
            }
        }
        h = h / 2;
        a = a / 2;
        e = e / 2;
        r = r / 2;
        
        System.out.println(Math.min(h,Math.min(a, Math.min(e, r))));
        br.close();
    }
}