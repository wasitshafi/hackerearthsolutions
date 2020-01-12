import java.util.Scanner;
class TestClass
{
    public static void main(String args[])
    {
        int n;
        String village;
        boolean isPossible = true;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        scan.nextLine();
        village = scan.nextLine();
        
        for(int i = 0 ; i < village.length() - 1 ; i++)
        {
            if(village.charAt(i) == 'H' && village.charAt(i + 1) == 'H')
            {
                isPossible = false;
                break;
            }
        }
        if(isPossible == true)
        {
            System.out.println("YES");
            for(int i = 0 ; i < village.length() ; i++)
            {
                if(village.charAt(i) =='.')
                    System.out.print("B");
                else
                    System.out.print(village.charAt(i));
            }
        }
        else
            System.out.print("NO");
    }
}
