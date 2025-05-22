package pertemuan4;

public class StrukturListTest {

	public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        //Latihan 3 addMiddle
        list.addTail(3);  // Tambah elemen 3 di akhir
        list.addTail(4);  // Tambah elemen 4 di akhir
        list.addMid(7, 2);  // Tambah elemen 7 di index 2
        list.addMid(8, 2);  // Tambah elemen 8 di index 2
        list.addTail(5);  // Tambah elemen 5 di awal

        list.displayElement();  // Output harus: 5 3 8 7 4
        
        //latihan 2 removeHead
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);
        
        System.out.println("Element List awal : ");
        list.displayElement();
        
        list.removeHead();
        
        System.out.println("List setelah remove head : ");
        list.displayElement();
        
        System.out.println("\nhapus elemnt list di awal 3x : ");
        
        list.removeHead();
        System.out.println("Setelah remove head 1: ");
        list.displayElement();
        
        list.removeHead();
        System.out.println("Setelah remove head 2: ");
        list.displayElement();
        
        list.removeHead(); //menampilkan list is empty, jika list sudah kosong
        
        //latihan 4 removeTail
        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);
        
        System.out.println("Element List awal : ");
        list.displayElement();
        
        list.removeTail();
        
        System.out.println("Setelah remove tail : ");
        list.displayElement();
        
        list.removeHead();
        System.out.println("Setelah remove head : ");
        list.displayElement();
        
        list.removeTail();
        System.out.println("List setelah remove tail lagi : ");
        list.displayElement();
    }
}
