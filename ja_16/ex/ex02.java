import java.io.*;
import java.util.StringTokenizer;

public class ex02 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            
            String str;
            int sum1 = 0;
            int sum2 = 0;
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, ", ");
            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                if (n%2 == 0) sum2 += n;
                else sum1 += n;
            }
            System.out.println("kisuu:" + sum1);
            System.out.println("guusuu:" + sum2);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
