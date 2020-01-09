import java.util.Scanner;
 
class TestClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int countZ, countO;
        
        countZ = countO = 0;
        for(int i = 0 ; i < s.length() ; i++)
            if(s.charAt(i) == 'z')
                countZ++;
            else if(s.charAt(i) == 'o')
                countO++;
        
        if(countZ * 2 == countO)
            System.out.println("Yes");
        else
            System.out.println("No");
    
        scan.close();
    }
}