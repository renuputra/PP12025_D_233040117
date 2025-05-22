package pertemuan10;

public class StrukturStack {

	private int[] array;
    private int capacity;
    private int TOP;
    
    public final int MIN = -1;

    public StrukturStack(int capacity) {
    	super();
    	array = new int[capacity];
    	this.capacity = capacity;
    	TOP = MIN;
    }

    public boolean isEmpty() {
    	return TOP == MIN;
    }
    
    public boolean isFull() {
        return TOP == capacity - 1;
    }
    
    public int size() {
        return TOP + 1;
    }
    
    public int top() {
        if (!isEmpty()) {
            return array[TOP];
        } else {
            System.out.println("Stack kosong.");
            return -1;
        }
    }
    
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Penuh");
		} else {
			TOP++;
			array[TOP] = data;
		}
	}
	
	public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Tidak bisa pop.");
            return -1;
        } else {
            int data = array[TOP];
            System.out.println("Pop: " + data);
            TOP--;
            return data;
        }
    }
	
	//Getter Methods
	public int getTop() {
	    return TOP;
	}

	public int getElementAt(int index) {
	    if (index >= 0 && index <= TOP) {
	        return array[index];
	    } else {
	        throw new IndexOutOfBoundsException("Index tidak valid untuk stack");
	    }
	}
}
