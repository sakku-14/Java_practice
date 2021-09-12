package pack2;
import pack1. Super;

// class Sub extends pack1.Super {
class Sub extends Super {
        public Sub() {
        super();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // System.out.println("c = " + c);
        // System.out.println("d = " + d);
    }
}

public class Java11_1 {
    public static void main(String args[]) {
        Sub sub = new Sub();
        Super s = new pack1.Super();
        System.out.println(s.a);
    }
}
