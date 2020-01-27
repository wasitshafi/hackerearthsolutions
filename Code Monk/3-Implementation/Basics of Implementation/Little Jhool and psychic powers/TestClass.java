/**
    @author wasitshafi
    @since  26-01-2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

//I can also use some other string searching algorithms refer : https://github.com/wasitshafi/Competitive-Programming/tree/master/java/StringSearchingAlgorithms
class RabinKarpSearch extends Thread
{
    int index;
    String pattern;
    private static String str = "";
    private static int primeno = 101;
    
    public RabinKarpSearch(String str, String pattern)
    {
        this.str = str;
        this.pattern = pattern;
        index = -1;
    }

    public RabinKarpSearch(String pattern)
    {
        this.pattern = pattern;
        index = -1;
    }
    public int getIndex()
    {
        return index;
    }

    public static long getHash(String str, long len)
    {
        long hash = 0;
        for(int i = 0 ; i < len ; i++) hash += str.charAt(i) * Math.pow(primeno, i);
        return hash;
    }

    public static long getHashRepeatedly(long strHashValue, char oldChar, char newChar, int patternLength)
    {   
        strHashValue = strHashValue - oldChar; 
        strHashValue = strHashValue / primeno;
        strHashValue = strHashValue + newChar * (long)Math.pow(primeno, patternLength - 1);
        return strHashValue;
    }

    public void run()
    {
        int strLength = str.length();
        int patternLength = pattern.length();

        if(strLength >= patternLength)
        {
            long patternHashValue = getHash(pattern, patternLength);
            long strHashValue = getHash(str, patternLength);             

            if(strHashValue == patternHashValue) index = 0;
            if(index != 0)
            {
                for(int i = 1 ; i < strLength - patternLength + 1 ; i++)
                {
                    strHashValue = getHashRepeatedly(strHashValue, str.charAt(i - 1), str.charAt(i + patternLength - 1), patternLength);
                    if(patternHashValue == strHashValue && pattern.equals(str.substring(i, i + patternLength)) )
                    {
                        index =i;
                        break;
                    }
                }
            }
        }
    }
}

public class TestClass
{
    public static void main(String... args) throws Exception
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();   // we can also use build in String class methods contains() instead of creating of our own class that too along with multithreading     
        RabinKarpSearch trdZero = new RabinKarpSearch(str, "000000");
        RabinKarpSearch trdOne = new RabinKarpSearch("111111");
        
        trdZero.start();
        trdOne.start();

        trdZero.join();
        trdOne.join();

        if(trdZero.getIndex() == -1 && trdOne.getIndex() == -1)
            System.out.println("Good luck!");
        else
            System.out.println("Sorry, sorry!");
        br.close();
    }
}