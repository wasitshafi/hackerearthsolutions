import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int n;
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= 10 ; i++) sb.append(n * i + "\n");
        System.out.println(sb);
        br.close();
    }
}