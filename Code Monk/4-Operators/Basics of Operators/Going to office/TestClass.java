/**
    @author  wasitshafi
    @since   30-01-2020 
*/
import java.util.Scanner;
import java.math.BigInteger;
class TestClass
{
    public static void main(String... args)
    {
        long d;  // Inorder to avoid overflow error during arithmetic operation because of 'int' data type, so use 'long' instead of 'int'
        long Oc, Of, Od;      // Online-taxi
        long Cs, Cb, Cm, Cd;  // Classic-taxi
        Scanner scan = new Scanner(System.in);
        BigInteger onlineTaxiCost = new BigInteger("0");
        BigInteger classicTaxiCost = new BigInteger("0");
        
        d = scan.nextInt();
        Oc = scan.nextInt(); // cost for first 'Of' km
        Of = scan.nextInt(); // first 'Of' km
        Od = scan.nextInt(); // cost for after 'Of' km
        onlineTaxiCost = BigInteger.valueOf(Oc + (d - Of) * Od);   
    
        Cs = scan.nextInt(); // speed
        Cb = scan.nextInt(); // basefare
        Cm = scan.nextInt(); // cost/miutes
        Cd = scan.nextInt(); // cost/km
        classicTaxiCost = BigInteger.valueOf(Cb + (d * Cd) + (d / Cs * Cm)); // Time = Distance/Speed
        
        if(onlineTaxiCost.compareTo(classicTaxiCost) <= 0)
            System.out.println("Online Taxi");
        else
            System.out.println("Classic Taxi");
        
        scan.close();
    }
}