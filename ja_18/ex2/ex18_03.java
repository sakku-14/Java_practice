import java.io.BufferedReader;
import java.io.FileReader;

public class ex18_03 {
    public static void main(String[] args) {
        
    }
}

public class FileInOut extends Thread {
    private BufferedReader br;
    private String str[];
    
    public FileInOut (String file) {
        br = new BufferedReader(new FileReader(file));
        str[] = new String[];
    }

    public synchronized run() {
        int i = 0;
        while (true) {
            
            br.readLine()
        }
    }
}