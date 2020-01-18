import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args)throws Exception
    {
        String s;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        s = bufferedReader.readLine();

        if(s.length() != 10)
            System.out.println("Illegal ISBN");
        else if(!(s.charAt(0) >= 48 && s.charAt(0) <= 57) && (s.charAt(1) >= 48 && s.charAt(1) <= 57) && (s.charAt(2) >= 48 && s.charAt(2) <= 57) && (s.charAt(3) >= 48 && s.charAt(3) <= 57) && (s.charAt(4) >= 48 && s.charAt(4) <= 57) && (s.charAt(5) >= 48 && s.charAt(5) <= 57) && (s.charAt(6) >= 48 && s.charAt(6) <= 57) && (s.charAt(7) >= 48 && s.charAt(7) <= 57) && (s.charAt(8) >= 48 && s.charAt(8) <= 57) && (s.charAt(9) >= 48 && s.charAt(9) <= 57) )
            System.out.println("Illegal ISBN&");
        else
        {
            int sum = 0;
            int ISBN[] = new int[10];

            ISBN[0] = s.charAt(0) - '0';
            ISBN[1] = s.charAt(1) - '0';
            ISBN[2] = s.charAt(2) - '0';
            ISBN[3] = s.charAt(3) - '0';
            ISBN[4] = s.charAt(4) - '0';
            ISBN[5] = s.charAt(5) - '0';
            ISBN[6] = s.charAt(6) - '0';
            ISBN[7] = s.charAt(7) - '0';
            ISBN[8] = s.charAt(8) - '0';
            ISBN[9] = s.charAt(9) - '0';
            
            for(int i = 0 ; i < 10 ; i++) sum = sum + ((i+1) * ISBN[i]);
            
            if(sum % 11 == 0)
                System.out.println("Legal ISBN");
            else
                System.out.println("Illegal ISBN");
        }
    }
}