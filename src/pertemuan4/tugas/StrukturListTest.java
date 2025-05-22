package pertemuan4.tugas;

public class StrukturListTest {
	 public static void main(String[] args) {
        StrukturList listA = new StrukturList();
        StrukturList listB = new StrukturList();

        //Membentuk deret a: 2.1 -> 3.4 -> 4.5
        listA.addTail(2.1);
        listA.addTail(3.4);
        listA.addTail(4.5);
        System.out.print("List A: ");
        listA.displayElement(); // Output: 2.1 3.4 4.5

        //Membentuk deret b: 3.4 -> 2.1 -> 1.1 -> 4.5 -> 5.5
        listB.addHead(3.4);
        listB.addMid(2.1, 2);
        listB.addMid(1.1, 3);
        listB.addTail(4.5);
        listB.addTail(5.5);
        System.out.print("List B: ");
        listB.displayElement(); // Output: 3.4 2.1 1.1 4.5 5.5
    }
}