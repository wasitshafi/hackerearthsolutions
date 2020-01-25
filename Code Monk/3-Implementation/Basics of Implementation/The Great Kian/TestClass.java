/**
    @author  wasitshafi
    @since   26-01-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        long s1, s2, s3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String arr[] = (br.readLine()).split(" ");
        
        s1 = s2 = s3 = 0;
        for(int i = 0 ; i < len ; i = i + 3) s1 += Integer.parseInt(arr[i]); 
        for(int i = 1 ; i < len ; i = i + 3) s2 += Integer.parseInt(arr[i]); 
        for(int i = 2 ; i < len ; i = i + 3) s3 += Integer.parseInt(arr[i]);
        
        System.out.println(s1 + " " + s2 + " " + s3);
        br.close();
    }
}
