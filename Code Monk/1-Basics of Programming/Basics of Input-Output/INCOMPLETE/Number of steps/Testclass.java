/**
    @author  wasitshafi
    @since   09-02-2020 
*/
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

// there is something wrong with #input 4
class TestClass
{
    public static void main(String... args)
    {
        int i, n, min, cost, diff, a[], b[];
        Scanner scan = new Scanner(System.in);
        boolean isPossible = true;

        n = scan.nextInt();
        a = new int[n];
        b = new int[n];
        
        for(i = 0 ; i < n ; i++) a[i] = scan.nextInt();
        for(i = 0 ; i < n ; i++) b[i] = scan.nextInt();
        
        min = a[0];
        for(i = 1 ; i < n ; i++)
            if(a[i] < min)
                min = a[i];
        cost = 0;
        for(i = 0 ; i < n ; i++)
        {
            if(a[i] == min)
                continue;
            else
            {
                if(b[i] == 0 || b[i] > a[i])
                {
                    isPossible = false;
//                    System.out.println("*::  i : " + i + "\ta[i] : " + a[i] + "\tb[i] : " + b[i]);
                    break;
                }
                else
                {
                    diff = a[i] - min;
                    if(diff % b[i] != 0)
                    {
                        isPossible = false;
  //                      System.out.println("#::  i : " + i + "\ta[i] : " + a[i] + "\tb[i] : " + b[i]);
    //                    System.out.println("#::  min : " + min + "\tdiff : " + diff + "\tdiff%n[i] : " + diff % b[i]);
                        break;
                    }
                    else
                        cost = cost + (diff / b[i]);
                }
            }
        }
        if(isPossible)
            System.out.println(cost);
        else
            System.out.println("-1");
        scan.close();
    }
}