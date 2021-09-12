public class multi {
    public static void main(String[] args) {
        TThread t1 = new TThread("saku");
        TThread t2 = new TThread("yuki");

        t1.start();
        t2.start();

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("main working...");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println("main finished");
        }
    }
}

class TThread extends Thread {
    private String TName;

    TThread(String name) {
        this.TName = name;
    }

    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(TName + " working");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(e);
        }finally {
            System.out.println(TName + " finished");
        }
    }
}
