import java.util.Scanner;
import java.util.Arrays;

class TestClass
{
    public static void main(String args[])
    {
        int n, sum, arr[] = new int[26];
        Scanner scan = new Scanner(System.in);
        String s = "";
        
        n = scan.nextInt();
        while(n-- != 0)
        {
            Arrays.fill(arr, 0);
            sum = 0;
            s = scan.next();
            for(int i = 0 ; i < s.length() ; i++)
            {
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    arr[s.charAt(i) - 'a']++;
                else
                    arr[s.charAt(i) - 'A']++;
            }
            scan.nextLine();
            s = scan.next();

            for(int i = 0 ; i < s.length() ; i++)
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    arr[s.charAt(i) - 'a']--;
                else
                    arr[s.charAt(i) - 'A']--;
            for(int i = 0 ; i < 26 ; i++) sum += Math.abs(arr[i]);
            System.out.println(sum);
        }
        scan.close();
    }
}