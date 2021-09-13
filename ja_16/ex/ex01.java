import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;

public class ex01 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
