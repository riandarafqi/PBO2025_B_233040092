package Tugas_Praktek_Kelas_AbstrakDanInterface;

public class BukuFiksi extends Buku {

    // Konstruktor untuk inisialisasi judul dan penulis buku fiksi
    public BukuFiksi(String judul, String penulis) {
        super(judul, penulis);  // Memanggil konstruktor dari kelas induk (Buku)
    }

    // Implementasi metode informasiBuku() untuk BukuFiksi
    @Override
    public void informasiBuku() {
        System.out.println("Buku Fiksi: " + getJudul() + " oleh " + getPenulis());
    }

    // Implementasi metode pinjam() untuk BukuFiksi
    @Override
    public void pinjam() {
        System.out.println("Buku Fiksi " + getJudul() + " telah dipinjam.");
    }

    // Implementasi metode kembalikan() untuk BukuFiksi
    @Override
    public void kembalikan() {
        System.out.println("Buku Fiksi " + getJudul() + " telah dikembalikan.");
    }
}