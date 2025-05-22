package pertemuan9;

public class StrukturQueue {

	Node FRONT, REAR;
	int size;

	StrukturQueue() {
		FRONT = REAR = null;
		size = 0;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		} else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}

	public boolean isEmpty() {
		return FRONT == null;
	}

	public int size() {
		int size = 0;
		Node curNode = FRONT;
		while (curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}

	public int front() {
		return FRONT != null ? FRONT.getData() : -1;
	}
	
	public void displayElements() {
        System.out.print("Elemen Queue: ");
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            Node current = FRONT;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
	
	public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue.");
        } else {
            System.out.println("Menghapus elemen: " + FRONT.data);
            FRONT = FRONT.next;
            if (FRONT == null) {
                REAR = null;
            }
            size--;
        }
    }
}