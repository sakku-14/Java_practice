public class MyVector {
    private int arr[];
    private int tail;

    public MyVector() {
        arr = new int[10];
        tail = 0;
    }

    public int size() {
        return (this.tail);
    }

    public void add(int n, int index) {
        if (index < 0 || index > tail)
            new ArrayIndexOutOfBoundsException();
        if (arr.length == tail) {
            int tmp[] = new int[arr.length + 10];
            for (int i = 0; i < arr.length; i++) tmp[i] = arr[i];
            arr = tmp;
        }
        for (int i = tail - 1; i >= index; i--) arr[i + 1] = arr[i];
        arr[index] = n;
        tail++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tail)
            new ArrayIndexOutOfBoundsException();
        for (int i = index; i < tail - 1; i++) arr[i] = arr[i + 1];
        tail--;
    }

    public int get(int index) {
        if (index < 0 || index >= this.arr.length)
            new ArrayIndexOutOfBoundsException();
        return (this.arr[index]);
    }
}
