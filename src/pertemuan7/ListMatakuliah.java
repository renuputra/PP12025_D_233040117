package pertemuan7;

public class ListMatakuliah {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }
    
    public void addMid(Matakuliah data, int position) {
        Node newNode = new Node(data);
        if (position <= 0 || isEmpty()) {
            addHead(data);
            return;
        }

        Node curNode = HEAD;
        int index = 0;

        while (curNode.getNext() != null && index < position - 1) {
            curNode = curNode.getNext();
            index++;
        }

        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }
    
    public int size() {
        int jum = 0;
        Node curNode = HEAD;
        
        while (curNode != null) {
            jum++;
            curNode = curNode.getNext();
        }

        return jum;
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah mk = curNode.getData();
                System.out.println(mk.getKode() + " - " + mk.getNama() + " (" + mk.getSks() + " SKS)");
                curNode = curNode.getNext();
            }
        }
        System.out.println();
    }
}
