package Pertemuan1.ElemenList;

public class Node {
	private int nilai;
	private Node next;
	
	//inisiasi node 
	public Node(int nilai) {
		this.nilai = nilai;
	}
	
	//setter untuk nilai 
	public void setNilai(int nilai) {
		this.nilai = nilai;	
	}
	
	//getter untuk nilai 
	public int getNilai() {
		return nilai;
	}
	
	//setter untuk next
	public void setNext(Node next) {
		this.next = next;
	}
	
	//getter untuk next 
	public Node getNext() {
		return next;
	}
}
