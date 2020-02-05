/**
   @author wasitshafi
   @since 01-02-2020
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int t, l, w;
        String s[] = new String[2];
        StringBuilder output = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        t = Integer.parseInt(br.readLine());
        while(t-- != 0)
        {
            s = (br.readLine()).split(" ");
            l = Integer.valueOf(s[0]);
            w = Integer.valueOf(s[1]);
            if(l == w)  // square
                output.append("1");
            else
            {
                if(l > w)
                    output.append(l / w); // fitting circles horizontally
                else
                    output.append(w / l); // fitting circles vertically
            }
            output.append("\n");
        }
        System.out.print(output);
        br.close();
    }
}