class test {
    private static int var1 = 0;

    public synchronized void decrease(String name) {
    // public void decrease(String name) {
        try {
            for (int i = 0; i < 10000; i++) {
                var1++;
            }
            System.out.println("var1 = " + var1);
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(name + "の処理が終了");
        }
    }
}

// class test {
//     private static int var1 = 20;
//     public void decrease(String name, test obj) {
//         synchronized(obj) {
//             try {
//                 var1--;
//                 System.out.println("var1 = " + var1);
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//                 System.out.println(e);
//             } finally {
//                 System.out.println(name + "の処理が終了");
//             }
//         }
//     }
// }


class test2 extends Thread {
    test obj;
    String name;

    test2(test obj, String name) {
        this.obj = obj;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            obj.decrease(name);
            // obj.decrease(name, obj);
        }
    }
}

public class join {
    public static void main(String[] args) {
        test tt = new test();
        test2 tt1 = new test2(tt, "A");
        test2 tt2 = new test2(tt, "B");
        test2 tt3 = new test2(tt, "C");
        test2 tt4 = new test2(tt, "D");

        System.out.println("_____Start_____");
        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();

        try {
            tt1.join();
            tt2.join();
            tt3.join();
            tt4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("_____Finish_____");
    }
}
