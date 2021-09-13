public class MyStack extends MyVector{
    public MyStack() {
        super();
    }

    public void push(int n) {
        this.add(n, 0);
    }

    public int pop() {
        int ret = this.get(0);
        this.remove(0);
        return (ret);
    }
}
