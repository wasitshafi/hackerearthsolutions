import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        float r;
        String arr[];
        int days, x, ans = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        days = Integer.parseInt(br.readLine());
        while(days-- != 0)
        {
            arr = (br.readLine()).split(" ");
            r = Integer.parseInt(arr[0]);
            x = Integer.parseInt(arr[1]);
            if(2 * (22.0/7) * r <= 100 * x) ans++; // 2*PI*r(circumference of Circle)
        }
        System.out.println(ans);
        br.close();
    }
}