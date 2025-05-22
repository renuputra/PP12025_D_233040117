package pertemuan7.tugas;

import java.util.Scanner;

public class ListMkTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListMatakuliah list = new ListMatakuliah();
        int pilihan;

        do {
            System.out.println("\n=== Menu Matakuliah ===");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Tambah di Tengah");
            System.out.println("4. Hapus di Awal");
            System.out.println("5. Hapus di Akhir");
            System.out.println("6. Hapus di Tengah");
            System.out.println("7. Tampilkan Semua Matakuliah");
            System.out.println("8. Cari Matakuliah");
            System.out.println("9. Tampilkan Jumlah Matakuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Kode MK: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama MK: ");
                    String nama = sc.nextLine();
                    System.out.print("SKS: ");
                    int sks = sc.nextInt();
                    sc.nextLine();

                    Matakuliah mk = new Matakuliah(kode, nama, sks);

                    if (pilihan == 1) list.addHead(mk);
                    else if (pilihan == 2) list.addTail(mk);
                    else {
                        System.out.print("Posisi (0 untuk awal): ");
                        int pos = sc.nextInt();
                        list.addMid(mk, pos);
                    }
                    break;

                case 4:
                    list.removeHead();
                    break;

                case 5:
                    list.removeTail();
                    break;

                case 6:
                    System.out.print("Posisi yang dihapus: ");
                    int pos = sc.nextInt();
                    list.removeMid(pos);
                    break;

                case 7:
                    list.displayElement();
                    break;

                case 8:
                    System.out.print("Masukkan kode matakuliah yang dicari: ");
                    String cari = sc.nextLine();
                    Matakuliah hasil = list.find(cari);
                    if (hasil != null)
                        System.out.println("Ditemukan: " + hasil.getKode() + " - " + hasil.getNama() + " (" + hasil.getSks() + " SKS)");
                    else
                        System.out.println("Matakuliah tidak ditemukan.");
                    break;

                case 9:
                    System.out.println("Jumlah Matakuliah: " + list.size());
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
