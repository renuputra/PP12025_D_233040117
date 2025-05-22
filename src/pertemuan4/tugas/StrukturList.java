package pertemuan4.tugas;

public class StrukturList {

	Node head;
    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addTail(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
	
    public void addMid(double data, int position) {
    	Node curNode, posNode = null;
    	int i;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
        	curNode = head;
        	if(position == 1) {
        		newNode.next = curNode;
        		head = newNode;
        	} else {
        		i = 1;
        		while (curNode != null && i < position) {
        			posNode = curNode;
        			curNode = curNode.next;
        			i++;
        		}
        		posNode.next = newNode;
        		newNode.next = curNode;
        	}
        	if (posNode != null) {
                posNode.next = newNode;
            }
            newNode.next = curNode;
        }   
    }
    public void displayElement() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}