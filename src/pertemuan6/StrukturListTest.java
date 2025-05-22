package pertemuan6;

public class StrukturListTest {
	// Kelas untuk menghapus semua elemen dalam list
	public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);

        list.displayElement();

        list.clear();

        if (list.isEmpty()) {
            System.out.println("List Kosong");
        } else {
            list.displayElement();
        }
    }
}