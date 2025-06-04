package Tugas_Praktek_Kelas_AbstrakDanInterface;

public abstract class Buku {
    private String judul; // Menyimpan judul buku
    private String penulis; // Menyimpan nama penulis buku

    // Konstruktor untuk inisialisasi atribut judul dan penulis
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Getter untuk atribut judul
    public String getJudul() {
        return judul;
    }

    // Setter untuk atribut judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter untuk atribut penulis
    public String getPenulis() {
        return penulis;
    }

    // Setter untuk atribut penulis
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Metode abstrak untuk menampilkan informasi buku
    public abstract void informasiBuku();

    // Metode abstrak untuk meminjam buku
    public abstract void pinjam();

    // Metode abstrak untuk mengembalikan buku
    public abstract void kembalikan();
}
