package Tugas_Praktek_Kelas_AbstrakDanInterface;

public class BukuNonFiksi extends Buku {

    // Konstruktor untuk inisialisasi judul dan penulis buku non-fiksi
    public BukuNonFiksi(String judul, String penulis) {
        super(judul, penulis);  // Memanggil konstruktor dari kelas induk (Buku)
    }

    // Implementasi metode informasiBuku() untuk BukuNonFiksi
    @Override
    public void informasiBuku() {
        System.out.println("Buku Non-Fiksi: " + getJudul() + " oleh " + getPenulis());
    }

    // Implementasi metode pinjam() untuk BukuNonFiksi
    @Override
    public void pinjam() {
        System.out.println("Buku Non-Fiksi " + getJudul() + " telah dipinjam.");
    }

    // Implementasi metode kembalikan() untuk BukuNonFiksi
    @Override
    public void kembalikan() {
        System.out.println("Buku Non-Fiksi " + getJudul() + " telah dikembalikan.");
    }
}