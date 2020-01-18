import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String args[] ) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        if((Integer.parseInt(bufferedReader.readLine())) % 3 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
