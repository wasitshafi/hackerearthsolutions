import static java.lang.System.out;
import java.util.Scanner;
 
class TestClass
{
    public static void main(String[] args)
    {
        int n, seatNo;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        
        while(n-- != 0)
        {
            seatNo = scan.nextInt();
            temp = seatNo % 12;
            
            switch(temp)
            {
                case 1:  out.println((seatNo + 11) + " WS");
                         break;
                case 2:  out.println((seatNo + 9)  + " MS");
                         break;
                case 3:  out.println((seatNo + 7)  + " AS");
                         break;
                case 4:  out.println((seatNo + 5)  + " AS");
                         break;
                case 5:  out.println((seatNo + 3)  + " MS");
                         break;
                case 6:  out.println((seatNo + 1)  + " WS");
                         break;
                case 7:  out.println((seatNo + -1) + " WS");
                         break;
                case 8:  out.println((seatNo + -3) + " MS");
                         break;
                case 9:  out.println((seatNo + -5) + " AS");
                         break;
                case 10: out.println((seatNo + -7) + " AS");
                         break;
                case 11: out.println((seatNo + -9) + " MS");
                         break;
                case 0:  out.println((seatNo + -11)+ " WS");
                         break;
            }
        }
        scan.close();
    }
}