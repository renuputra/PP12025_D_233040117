package pertemuan10;

public class AbstractStack {
    public int[] arr;
    public int top;
    public int capacity;

    public AbstractStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public int size() {
        return top + 1;
    }
}
