package pertemuan5;

public class StrukturListTest {

	public static void main(String[] args) {
        StrukturList list = new StrukturList();
        //Latihan 2
        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);
        
        System.out.println("Element list awal : ");
        list.displayElement();
        
        list.removeMid(3);
        
        System.out.println("Setelah remove mid (3)");
        list.displayElement();
        
        //Tes
        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);
        
        System.out.println("Element list awal : ");
        list.displayElement();
        
        list.removeMid(3);
        list.removeMid(6);
        list.removeMid(5);
        
        System.out.println("Setelah remove mid (3, 6, 5)");
        list.displayElement();
    }
}