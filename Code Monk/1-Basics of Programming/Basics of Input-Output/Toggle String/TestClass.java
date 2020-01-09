import java.util.Scanner;

class TestClass
{
    public static void main(String... args)
    {
        String s = (new Scanner(System.in)).nextLine();
        
        for (int i = 0 ; i < s.length() ; i++)
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                System.out.print((char)(s.charAt(i) + 32));
            else
                System.out.print((char)(s.charAt(i) - 32));
    }
}