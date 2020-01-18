/**
 * @author wasitshafi
 * @since 16-01-2020
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String... args) throws Exception
    {
        StringBuilder sb = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        temp.append(br.readLine());   
        while(!(temp.toString().equals("42")))
        {
                sb.append(temp + "\n");
                temp.setLength(0);
                temp.append(br.readLine()); 
        }
        System.out.println(sb);
        br.close();
    }
}