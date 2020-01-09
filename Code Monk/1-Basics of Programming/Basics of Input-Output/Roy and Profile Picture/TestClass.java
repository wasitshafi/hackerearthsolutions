import java.util.Scanner;
import static java.lang.System.out;


class TestClass
{
    public static void main(String... args)
    {
        int l, n, w, h;
        Scanner scan = new Scanner(System.in);
        
        l = scan.nextInt();
        n = scan.nextInt();
        while(n-- != 0)
        {
            w = scan.nextInt();
            h = scan.nextInt();
            
            if(w < l || h < l)
                out.println("UPLOAD ANOTHER");
            else // they are large enough
            {  
              if(w == h)
                out.println("ACCEPTED");
              else
                out.println("CROP IT");
            }
        }
        scan.close();
    }
}