/**
    @author  wasitshafi
    @since   19-01-2020
*/
import java.util.Scanner;
import java.math.BigInteger;
 
public class TestClass
{
    public static void main(String... args)
    {
        int i, n, j, nextTerms, end;
        BigInteger sum, maxSum, prefixSum[];
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        prefixSum = new BigInteger[n];
        
        prefixSum[0] = new BigInteger(scan.next());
        for(i = 1 ; i < n ; i++)
        {
            prefixSum[i] = new BigInteger(scan.next());
            prefixSum[i] = prefixSum[i].add(prefixSum[i - 1]);
            System.out.println("(" + i + ")");
        }

        maxSum = prefixSum[prefixSum.length - 1];
        for(i = 0 ; i < n ; i++)
        {
            end = i;
            nextTerms = 0;
            sum = BigInteger.ZERO;
            while(end + nextTerms < n)
            {
                nextTerms++;
                end = end + nextTerms;
            }
            
            if(i == 0)
                sum = prefixSum[end - 1];
            else
                sum = prefixSum[end - 1].subtract(prefixSum[i - 1]);
                
            if(maxSum.compareTo(sum) == -1) maxSum = sum;
        }

        System.out.println("Sum : ");
        System.out.println(maxSum);
        scan.close();
    }
}