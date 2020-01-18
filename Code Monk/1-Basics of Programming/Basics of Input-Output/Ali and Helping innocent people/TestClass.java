import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        char c;
        String tag;
        int first, second, third, fourth, fifth, sixth, seventh;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        tag = br.readLine();

        first = tag.charAt(0) - 48;
        second = tag.charAt(1) - 48;
        c = tag.charAt(2);
        third = tag.charAt(3) - 48;
        fourth = tag.charAt(4) - 48;
        fifth = tag.charAt(5) - 48;
        sixth = tag.charAt(7) - 48;
        seventh = tag.charAt(8) - 48;
        
        if( (first + second) % 2 == 0 && (third + fourth) % 2 == 0 && (fourth + fifth) % 2 == 0 && (sixth + seventh) % 2 == 0 && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'Y')
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}