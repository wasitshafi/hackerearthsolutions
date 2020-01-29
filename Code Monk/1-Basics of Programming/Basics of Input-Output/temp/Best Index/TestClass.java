/**
    @author  wasitshafi
    @since   29-01-2020
*/
import java.util.Scanner;
import java.math.BigInteger;
 
public class TestClass
{
    public static void main(String... args)
    {
        int n, i, j, right;
        BigInteger prefixSum[];
        BigInteger sum = new BigInteger("0");
        Scanner scan = new Scanner(System.in);
        BigInteger maxSum = new BigInteger("-999999999999999999999999999");

        n = scan.nextInt();
        prefixSum = new BigInteger[n];
 
        prefixSum[0] = scan.nextBigInteger();
        for(i = 1 ; i < n ; i++) prefixSum[i] = (scan.nextBigInteger()).add(prefixSum[i - 1]);

        right = -1;
        for(i = 0 ; i < n ; i++)
        {
            j = 0;    // jth term of A.P.
            while(((j * (j + 1)) / 2 + i) <= n) // '<=' because its just for no. of terms in general
            {
                right = ((j * (j + 1)) / 2 + i);
                j++;
            }
            right--;  // because of 0-based indexing
         
            if(i == 0)
                sum = prefixSum[right];
            else
                sum = prefixSum[right].subtract(prefixSum[i - 1]);
            if(sum.compareTo(maxSum) == 1) maxSum = sum;
        }

        System.out.println(maxSum);
        scan.close();
    }
}