import java.io.*;

public class s_in {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("値を入力してください:");
            String s = br.readLine();
            System.out.println("入力された値:" + s);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
