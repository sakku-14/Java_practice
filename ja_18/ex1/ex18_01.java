import java.util.Vector;

public class ex18_01 {
    public static void main(String[] args) {
        MyVector vector = new MyVector();
        for (int i = 0; i < 20; i++) {
            vector.add(i, i);
        }
        vector.remove(0);
        System.out.println(vector.get(0));
        System.out.println(vector.size());
        Vector<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(1, 3);
        arr.add(1, 4);
        System.out.println(arr.get(1));

    }
}