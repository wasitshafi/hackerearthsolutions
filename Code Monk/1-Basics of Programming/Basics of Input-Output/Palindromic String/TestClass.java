import java.util.Scanner;

class TestClass
{
    public static void main(String args[])
    {
        int i, j;
        String str;
        
        str = (new Scanner(System.in)).nextLine();
        for(i = 0, j = str.length() - 1 ; i <= j ; i++ , j--)
            if(str.charAt(i) != str.charAt(j)) break;
        
        if(i > j)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}