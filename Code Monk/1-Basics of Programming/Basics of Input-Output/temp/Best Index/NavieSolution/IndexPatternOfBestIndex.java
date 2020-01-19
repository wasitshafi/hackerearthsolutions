import java.util.Scanner;

public class IndexPatternOfBestIndex
{
    public static void main(String... args)
    {
        int n;
        int terms = 0;
        int i, j , k;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
        for(i = 0 ; i < n ; i++)
        {
            terms = 0;
            for(j = i ; j < n - terms ; j++, terms++)
            {
                for(k = j ; k <= j + terms ; k++) System.out.print(k + " ");
                j = k - 1;
                System.out.print(" * ");
            }
            System.out.println();
        }
        scan.close();
    }
}