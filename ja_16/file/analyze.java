import java.io.*;
import java.util.StringTokenizer;

public class analyze {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));

            String str;
            String name;
            String nationality;
            int age;
            while (true) {
                str = br.readLine();
                if (str == null) break;
                StringTokenizer st = new StringTokenizer(str, ",");
                name = st.nextToken();
                nationality = st.nextToken();
                age = Integer.parseInt(st.nextToken());
                System.out.println("name: " + name);
                System.out.println("nationality: " + nationality);
                System.out.println("age: " + age);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
