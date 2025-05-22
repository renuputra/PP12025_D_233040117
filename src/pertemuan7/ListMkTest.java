package pertemuan7;

public class ListMkTest {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();

        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 1);
        list.addMid(new Matakuliah("IF002", "Pemrograman Web", 3), 2);
        list.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        
        // Tambahan dua matakuliah agar jadi 6
        list.addTail(new Matakuliah("IF005", "Matematika Diskrit", 3));
        list.addTail(new Matakuliah("IF006", "Sistem Operasi", 3));

        list.displayElement();
        System.out.println("Jumlah Matakuliah: " + list.size());
    }
}
