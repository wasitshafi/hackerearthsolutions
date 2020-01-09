import java.util.Scanner;
import java.util.Arrays;
class TestClass
{
    public static void main(String args[])
    {
        int n;
        String str1, str2;
        boolean identical;
        int countStr1[] = new int[26];
        int countStr2[] = new int[26];
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        while(n-- != 0)
        {
            str1 = scan.next();
            str2 = scan.next();
            
            Arrays.fill(countStr1, 0);
            Arrays.fill(countStr2, 0);
            identical = true;
            
            for(int i = 0 ; i < str1.length() ; i++)
                if(str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
                    countStr1[str1.charAt(i) - 'A']++;
                else
                    countStr1[str1.charAt(i) - 'a']++;
            
            for(int i = 0 ; i < str2.length() ; i++)
                if(str2.charAt(i) >= 65 && str2.charAt(i) <= 90)
                    countStr2[str2.charAt(i) - 'A']++;
                else
                    countStr2[str2.charAt(i) - 'a']++;

            for(int i = 0 ; i < 26 ; i++)
                if(countStr1[i] != countStr2[i])
                {
                    identical = false;
                    break;
                }
                
            if(identical)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        scan.close();
    }
}