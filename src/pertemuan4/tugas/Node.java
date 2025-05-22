package pertemuan4.tugas;

public class Node {
    double data;
    Node next;

    // Inisialisasi atribut node dengan bilangan pecahan (double)
    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    // Setter & Getter
    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}