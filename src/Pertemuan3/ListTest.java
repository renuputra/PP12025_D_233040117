package Pertemuan3;

public class ListTest {
	
	public static void main (String [] args) {
		StrukturList list = new StrukturList();
		list.addTail (3);
		list.addTail (4);
		list.addTail (5);
		
		System.out.println("Elemen : ");
		list.displayElement();
		
		// Test-1 A //
		StrukturList listA = new StrukturList();
		listA.addTail (3);
		listA.addTail (4);
		listA.addTail (5);
		
		System.out.println(" ");
		System.out.println("Elemen A: ");
		listA.displayElement();
		
		// Test-1 B //
		StrukturList listB = new StrukturList();
		listB.addTail (1);
		listB.addTail (4);
		listB.addTail (5);
		listB.addTail (7);
		
		System.out.println(" ");
		System.out.println("Elemen B: ");
		listB.displayElement();
		
		// Test-2 //
		
		// 1. Create List dengan keyword new
		StrukturList listHead = new StrukturList();
		
		// 2. Tambah elemen 5 kali di awal list 
		listHead.addHead(5);
		
		// 3. 
		listHead.addHead(4);
		
		// 4.
		listHead.addHead(3);
		
		System.out.println("Elemen: ");
		listHead.displayElement();
		
		StrukturList listAHead = new StrukturList();
		listAHead.addHead (1);
		listAHead.addHead (2);
		listAHead.addHead (3);
		
		System.out.println(" ");
		System.out.println("Elemen A: ");
		listAHead.displayElement();
		
		StrukturList listBHead = new StrukturList();
		listBHead.addHead (7);
		listBHead.addHead (4);
		listBHead.addHead (5);
		listBHead.addHead (1);
		
		System.out.println(" ");
		System.out.println("Elemen B: ");
		listBHead.displayElement();
	}
}






