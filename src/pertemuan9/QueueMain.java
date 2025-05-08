package pertemuan9;

public class QueueMain {

	public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        System.out.println("### Sebelum Enqueue ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        // Enqueue elemen
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("\n### Setelah Enqueue 3x ###");
        queue.displayElements();
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());

        // Dequeue satu elemen
        System.out.println("\n### Setelah Dequeue 1x ###");
        queue.dequeue();
        queue.displayElements();
        System.out.println("size: " + queue.size());
        System.out.println("Front: " + queue.front());
    }
}
