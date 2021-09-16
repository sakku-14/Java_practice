import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex18_03 {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("in1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("in2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

            FileInOut f1 = new FileInOut(br1, bw);
            FileInOut f2 = new FileInOut(br2, bw);

            f1.start();
            f2.start();

            f1.join();
            f2.join();

            br1.close();
            br2.close();
            bw.close();
        } catch(IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class FileInOut extends Thread {
    private static Object obj = new Object();
    private BufferedReader br;
    private BufferedWriter bw;
    
    public FileInOut (BufferedReader br, BufferedWriter bw) {
        this.br = br;
        this.bw = bw;
    }

    public void run() {
        try {
            String str;
        
            while (true) {
                synchronized(obj) {
                    str = br.readLine();
                    if (str == null) break;
                    bw.write(str);
                }
            }
        } catch (Exception e) {
            System.err.println(e);;
        }
    }
}

// class FileInOut extends Thread {
//     private BufferedReader br;
//     private BufferedWriter bw;
    
//     public FileInOut (BufferedReader br, BufferedWriter bw) {
//         this.br = br;
//         this.bw = bw;
//     }

//     public synchronized void run() {
//         try {
//             String str;
        
//             while (true) {
//                 str = br.readLine();
//                 if (str == null) break;
//                 bw.write(str);
//             }
//         } catch (Exception e) {
//             System.err.println(e);;
//         }
//     }
// }