    /**
    @author  wasitshafi
    @since   -01-2020 
*/
import java.util.Scanner;
import java.util.Arrays;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int n, arr[];
        int maxIndex, sum;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();

        max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < ; j++)
            {
                sum = 0;
                for(int k = j ; k < j +  ; k++)
                {
                    sum = sum + arr[k];
                }
                if(sum > max)
                {
                    max = sum;
                }
            }


        }

        scan.close();
    }
}