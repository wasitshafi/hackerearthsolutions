import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String... args) throws Exception
    {
        int totalMin, totalHour, n, arr[][];
        String temp[] = new String[4];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n][4];

        for(int i = 0 ; i < n ; i++)
        {
            temp = (bufferedReader.readLine()).split(" ");
            arr[i][0] =  Integer.parseInt(temp[0]); // starting hour
            arr[i][1] =  Integer.parseInt(temp[1]); // starting minute
            arr[i][2] =  Integer.parseInt(temp[2]); // ending hour
            arr[i][3] =  Integer.parseInt(temp[3]); // ending minute

            if(arr[i][0] == arr[i][2])
            {
                totalHour = 0;
                totalMin = arr[i][3] - arr[i][1];
                
                if(totalMin == 60)
                {
                    totalHour = 1;
                    totalMin = 0;
                }
            }
            else
            {
                totalMin  = (60 - arr[i][1]) + arr[i][3];
                totalHour = arr[i][2] - arr[i][0] - 1;

                if(totalMin >= 60)
                {
                    totalHour = totalHour + (totalMin / 60);
                    totalMin = totalMin % 60;
                } 
            }
            System.out.println(totalHour + " " + totalMin);
        }
    }
}