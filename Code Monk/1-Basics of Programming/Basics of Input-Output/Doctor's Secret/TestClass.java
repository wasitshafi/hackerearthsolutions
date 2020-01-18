import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = (br.readLine()).split(" ");
        
        if(Integer.parseInt(arr[0]) <= 23 && (Integer.parseInt(arr[1]) >= 500 &&  Integer.parseInt(arr[1]) <= 1000))
            System.out.print("Take Medicine");
        else
            System.out.print("Don't take Medicine");
        br.close();
    }
}