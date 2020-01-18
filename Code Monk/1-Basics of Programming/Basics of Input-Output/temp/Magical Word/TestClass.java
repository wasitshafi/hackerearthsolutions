/**
    @author  wasitshafi
    @since   18-01-2020 
*/
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static Boolean isPrime(int n)
    {
        if(n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++) if(n % i == 0) return false;
        return true;
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

                nearestPrime.put((int)'y','q');// according to Test Cases he want for y,z be 113 i.e. 'q' instead of nearest prime 113 which is not within range i.e > 122 
                nearestPrime.put((int)'z','q');
                
                if(!(nearestPrime.containsKey(asciiValue)))
                {
                    
                    if(isPrime(asciiValue))
                        nearestPrime.put(asciiValue, (char)asciiValue);
                    else // Compute nearest prime
                    {
                        lowerPrime = asciiValue - 1;
                        upperPrime = asciiValue + 1;
                        while(!(isPrime(lowerPrime))) lowerPrime--; 
                        while(!(isPrime(upperPrime))) upperPrime++;
                        
                        if(asciiValue - lowerPrime <= upperPrime - asciiValue)
                            nearestPrime.put(asciiValue, (char)lowerPrime);
                        else
                            nearestPrime.put(asciiValue, (char)upperPrime);
                    }
                }
                ans.append(nearestPrime.get(asciiValue));
            }
            sb.setLength(0);
            ans.append("\n");
        }
        System.out.println(ans);
        
        System.out.println(nearestPrime);
        br.close();
    }
}