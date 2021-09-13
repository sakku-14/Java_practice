import java.io.*;

public class f_in_out {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String str;

            while (true) {
                str = br.readLine();
                if (str == null) break;
                bw.write(str + "\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
