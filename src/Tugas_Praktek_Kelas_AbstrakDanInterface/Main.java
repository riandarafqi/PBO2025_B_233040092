package Tugas_Praktek_Kelas_AbstrakDanInterface;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku fiksi dan non-fiksi
        Buku bukuFiksi = new BukuFiksi("Harry Potter", "J.K. Rowling");
        Buku bukuNonFiksi = new BukuNonFiksi("Sapiens", "Yuval Noah Harari");

        // Menampilkan informasi buku
        bukuFiksi.informasiBuku();  // Menampilkan informasi buku fiksi
        bukuNonFiksi.informasiBuku();  // Menampilkan informasi buku non-fiksi

        // Meminjam dan mengembalikan buku
        bukuFiksi.pinjam();  // Buku fiksi dipinjam
        bukuNonFiksi.pinjam();  // Buku non-fiksi dipinjam

        bukuFiksi.kembalikan();  // Buku fiksi dikembalikan
        bukuNonFiksi.kembalikan();  // Buku non-fiksi dikembalikan
    }
}