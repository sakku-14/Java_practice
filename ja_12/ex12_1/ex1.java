interface Copy {
    public void copy();
}

interface Scanner {
    public void scan();
}

interface Print {
    public void print();
}

class Printer implements Print {
    public String Size;

    public Printer(String size) {
        this.Size = size;
    }

    public void print() {
        System.out.println("Printインターフェイスの実装");
    }
}

class MultiPrinter extends Printer implements Copy, Scanner {
    public MultiPrinter(String size) {
        super(size);
    }
    
    public void copy() {
        System.out.println("Copyインターフェイスの実装");
    }
    public void scan() {
        System.out.println("Scanインターフィイスの実装");
    }
}

public class ex1 {
    public static void main(String[] args) {
        MultiPrinter multi = new MultiPrinter("A4");
        multi.print();
        multi.copy();
        multi.scan();
        System.out.println(multi.Size);
    }
}
