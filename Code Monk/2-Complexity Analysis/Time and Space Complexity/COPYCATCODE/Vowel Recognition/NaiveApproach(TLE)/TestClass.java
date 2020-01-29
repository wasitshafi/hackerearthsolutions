/**
    @author  wasitshafi
    @since   20-01-2020 
*/
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int i, j, k, len, subStringVowelCount, n;
        long totalVowels = 0;

        Map<String, Integer> m = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        StringBuilder substr = new StringBuilder("");
        StringBuilder output = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        while(n-- != 0)
        {
            sb.append(br.readLine());
            len = sb.length(); 
            totalVowels = 0;
            for(i = 0 ; i < len ; i++)
            {
                for(j = 1; j + i <= len ; j++)
                {
                    substr.append(sb.substring(i,  j + i));
                    if(!m.containsKey(substr))
                    {
                        subStringVowelCount = 0;
                        for(k = 0 ; k < substr.length() ; k++) 
                            if(substr.charAt(k) == 'a' || substr.charAt(k) == 'e' || substr.charAt(k) == 'i' || substr.charAt(k) == 'o' || substr.charAt(k) == 'u' || substr.charAt(k) == 'A' || substr.charAt(k) == 'E' || substr.charAt(k) == 'I' || substr.charAt(k) == 'O' || substr.charAt(k) == 'U')
                                subStringVowelCount++;
                        m.put(substr.toString(), subStringVowelCount);
                    }
                    totalVowels += m.get(substr.toString()); 
                    substr.setLength(0);
                }
            }
            sb.setLength(0);
            output.append(totalVowels + "\n");
        }
        System.out.println(output);
        br.close();
    }
}