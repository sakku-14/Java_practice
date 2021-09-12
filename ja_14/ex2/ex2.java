public class ex2 {
    public static void main(String[] args) {
        exThread t1 = new exThread("A");
        exThread t2 = new exThread("B");
        exThread t3 = new exThread("C");
        exThread t4 = new exThread("D");

        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t4);

        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
    }
}

class exThread implements Runnable {
    private String name;

    public exThread(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + "___" + i + " times");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
