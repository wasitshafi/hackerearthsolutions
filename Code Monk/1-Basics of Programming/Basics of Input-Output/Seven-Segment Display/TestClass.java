// CTM : n digit number will always be greater than number having less than n digits, so our aim is to have number having as much as digits possible & there is only one digit i.e '1' which takes minimum 2 sticks, than its '7' which needs 3 sticks
/**
    @author  wasitshafi
    @since   28-01-2020 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int n, i, totalMatchSticks;
        StringBuilder sb = new StringBuilder("");
        StringBuilder output = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        while(n-- != 0)
        {
            sb.append(br.readLine());
            totalMatchSticks = 0;
            for(i = 0 ; i < sb.length() ; i++)
            {
                if(sb.charAt(i) == '0') totalMatchSticks += 6;
                else if(sb.charAt(i) == '1') totalMatchSticks += 2; 
                else if(sb.charAt(i) == '2') totalMatchSticks += 5; 
                else if(sb.charAt(i) == '3') totalMatchSticks += 5; 
                else if(sb.charAt(i) == '4') totalMatchSticks += 4; 
                else if(sb.charAt(i) == '5') totalMatchSticks += 5; 
                else if(sb.charAt(i) == '6') totalMatchSticks += 6; 
                else if(sb.charAt(i) == '7') totalMatchSticks += 3; 
                else if(sb.charAt(i) == '8') totalMatchSticks += 7; 
                else totalMatchSticks += 6;
            }
            if(totalMatchSticks % 2 != 0) // Say we have digit '2' which means we have 5 sticks so we can either have '11'(4 sticks) or '71'(5 sticks)
            {
                output.append('7');
                totalMatchSticks = totalMatchSticks - 3;
            }
            
                for(i = 0 ; i < totalMatchSticks ; i = i + 2) output.append("1");
            output.append("\n");
            sb.setLength(0);
        }
        System.out.print(output);
        br.close();
    }
}