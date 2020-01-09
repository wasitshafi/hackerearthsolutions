import java.util.Scanner;
import static java.lang.System.out;

class Point
{
    private int x, y;
    public Point() { x = y = 0; }
    public void left(){ x--; }   // consider points in XY-Plane
    public void right(){ x++; }
    public void up(){ y++; }
    public void down(){ y--; }
    public void showPoint(){ out.println(x + " " + y); }
}

public class Testclass
{
    public static void main(String args[] )
    {
        String str;
        Point p = new Point();
        
        str = (new Scanner(System.in)).nextLine();
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'L')
                p.left();
            else if(str.charAt(i) == 'R')
                p.right();
            else if(str.charAt(i) == 'U')
                p.up();
            else if(str.charAt(i) == 'D')
                p.down();
        }
        p.showPoint();
    }
}