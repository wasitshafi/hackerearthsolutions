/**
    @author  wasitshafi
    @since   19-01-2020
*/
import java.util.Scanner;
import java.util.Arrays;

public class jtemp
{
    public static void main(String... args)
    {
        int n, arr[], i, j, nextTerms, end, sum, maxSum;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        arr = new int[n];
        
        for(i = 0 ; i < n ; i++)  arr[i] = scan.nextInt();
        maxSum = arr[arr.length - 1];
        for(i = 0 ; i < n ; i++)
        {
            end = i;
            sum = 0;
            nextTerms = 0;
            while(end + nextTerms < n)
            {
                nextTerms++;
                end = end + nextTerms;
            }
            for(j = i ; j < end ; j++) sum = sum + arr[j];
            if(sum > maxSum) maxSum = sum;
        }
        System.out.println(maxSum);
        scan.close();
    }
}