/**
    @author wasitshafi
    @since  23-01-2020 
*/
import java.util.Scanner;
import java.util.Arrays;

class CountDigits
{
    public static void main(String... args)
    {
        String s;    
        int frequency[] = new int[10];
        Scanner scan = new Scanner(System.in);
        
        s = scan.next();
        Arrays.fill(frequency, 0);
        for(int i = 0 ; i < s.length() ; i++) frequency[s.charAt(i) - '0']++;
        for(int i = 0 ; i < 10 ; i++) System.out.println(i + " " + frequency[i]);
    }
}