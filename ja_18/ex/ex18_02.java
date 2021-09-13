public class ex18_02 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }
}
