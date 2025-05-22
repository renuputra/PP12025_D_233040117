package pertemuan6;

public class StrukturList {

	Node head;
	
	public boolean find(int x) {
    	Node curNode = head;
    	boolean ketemu = false;
    	
    	while (curNode != null && !ketemu) {
    		if (curNode.getData() == x)
    			ketemu = true;
    		else
    			curNode = curNode.getNext();
    	}
    	return ketemu;
    }
	
	public int size() {
        Node curNode = head;
        int jumlah = 0;
        while (curNode != null) {
            jumlah++;
            curNode = curNode.next;
        }
        return jumlah;
    }
	
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
    
    public void clear() {
        head = null;
    }
    
    public boolean isEmpty() {
    	return head == null;
    }
    
    private void dispose(Node node) {
    	node.setNext(null);
    	node = null;
    }
    
    public void removeHead() {
    	if(isEmpty()) {
    		System.out.println("List is empty");
    	}else {
    		Node temp = head;
    		head = head.getNext();
    		dispose(temp);
    	}
    }

    public void removeTail() {
    	if(isEmpty()) {
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
    
    public void removeMid(int data) {
    	if(isEmpty()) {
    		System.out.println("List is Empty");
    	}else {
    		Node preNode = null;
    		Node tempNode = head;
    		boolean ketemu = false;
    		int i = 1;
    		
    		while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getData() == data) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (tempNode.getNext() == null && tempNode.getData() == data) {
                ketemu = true;
            }

            if (ketemu) {
                if (i == 1) {
                    head = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    tempNode = null;
                }
            } else {
                System.out.println("Data " + data + " tidak ditemukan");
            }
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