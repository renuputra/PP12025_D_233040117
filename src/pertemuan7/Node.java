package pertemuan7;

public class Node {
	private Matakuliah data;
	private Node next;
	
	Node(Matakuliah data) {
		this.data = data;
	}
	
	public Matakuliah getData() {
		return data;
	}
	
	public void setData(Matakuliah data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
