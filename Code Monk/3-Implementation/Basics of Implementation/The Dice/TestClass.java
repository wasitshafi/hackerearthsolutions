/**
 * @author wasit shafi
 * @since  10-03-2020
 */ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class TestClass
{
    public static void main(String[] args) throws Exception
    {
        String s;
        int count, len;
        boolean isValid = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        s =  br.readLine();
        len = s.length();
        count = 0;
        if(s.charAt(len - 1) == '6')
        {
            System.out.print("-1");
            System.exit(0);
        }
        
        for(int i = 0 ; i < len ; i++)
        {
            if(s.charAt(i) == '6') while(i < len && s.charAt(i) == '6') i++;
            count++;
        }
                
        if(isValid)
            System.out.println(count);
        else
            System.out.println("-1");
    }
}