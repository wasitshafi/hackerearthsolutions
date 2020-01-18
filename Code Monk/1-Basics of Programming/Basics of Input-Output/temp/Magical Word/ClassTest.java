/**
    @author  wasitshafi
    @since   18-01-2020 
*/
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ClassTest
{
    public static Boolean isPrime(int n)
    {
        if(n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++) if(n % i == 0) return false;
        return true;
    }

    public static int getLowerPrime(int n)
    {
        if(n < 67) return 67;       // special case for A,B
        while(!isPrime(n)) n--;
        return n;
    }

    public static int getUpperPrime(int n)
    {
            if(n == 90) return 98;  // special case for 'Z'
            if(n > 113) return 113;
            while(!isPrime(n)) n++;
            return n;
    }

    public static void main(String... args) throws Exception
    {
        int n, len, asciiValue, lowerPrime, upperPrime;
        Map<Integer, Character> nearestPrime = new HashMap<>();
        StringBuilder sb = new StringBuilder(""), ans = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        while(n-- != 0)
        {
            len = Integer.parseInt(br.readLine());
            sb.append(br.readLine());
            for(int i = 0 ; i < len ; i++)
            {
                asciiValue = (int)sb.charAt(i);
                if(!(nearestPrime.containsKey(asciiValue)))
                {
                    if(asciiValue < 65)  // only upperprime exists
                        nearestPrime.put(asciiValue, 'C'); // 67  = 'C'
                    else if(asciiValue > 122) // only lowerPrime exists
                        nearestPrime.put(asciiValue, 'q'); // 113 = 'q'
                    else if(asciiValue > 90 && asciiValue < 97)
                    {
                        if(asciiValue - 89 <= 97 - asciiValue)
                            nearestPrime.put(asciiValue, 'Y'); //89 = 'Y'
                        else
                            nearestPrime.put(asciiValue, 'a'); //97 = 'a'
                    }
                    else if((asciiValue >= 65 && asciiValue <= 90) && (asciiValue >= 97 && asciiValue <= 122))
                    {
                        if(isPrime(asciiValue))
                            nearestPrime.put(asciiValue, (char)asciiValue);
                        else // compute lowerPrime and upperPrime
                        {
                            lowerPrime = getLowerPrime(asciiValue);
                            upperPrime = getUpperPrime(asciiValue);
                            if(asciiValue - lowerPrime <= upperPrime - asciiValue)
                                nearestPrime.put(asciiValue, (char)lowerPrime);
                            else
                                nearestPrime.put(asciiValue, (char)upperPrime);
                        }
                    }
                }
                ans.append(nearestPrime.get(asciiValue));
            }
            sb.setLength(0);
            ans.append("\n");
        }
        System.out.println(ans);
        br.close();
    }
}