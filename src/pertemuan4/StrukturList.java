package pertemuan4;

public class StrukturList {

	Node head;
	
    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addTail(int data) {
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
	
    public void addMid(int data, int position) {
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
    
    public boolean isEmptty() {
    	return head == null;
    }
    
    private void dispose(Node node) {
    	node.setNext(null);
    	node = null;
    }
    
    public void removeHead() {
    	if(isEmptty()) {
    		System.out.println("List is empty");
    	}else {
    		Node temp = head;
    		head = head.getNext();
    		dispose(temp);
    	}
    }

    public void removeTail() {
    	if(isEmptty()) {
    		System.out.println("List is empty");
    	} else {
    		Node lastNode = head;
    		Node preNode = null;
    		
    		while(lastNode.getNext() != null) {
    			preNode = lastNode;
    			lastNode = lastNode.getNext();
    		}
    		
    		preNode.setNext(null);
    		dispose(lastNode);
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
