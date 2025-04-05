package Pertemuan7;

public class MataKuliah {
    private String kode;
    private String nama;
    private String index;
    private Dosen dosen;
    private int sks;

    /* Konstruktor */
    public MataKuliah(String kode, String nama, String index, int sks, Dosen dosen) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
        this.dosen = dosen;
    }

    public double nilaiIndex() {
        // Berdasarkan index matakuliah
        // A = 4, AB = 3.5, B, 3, BC = 2.5, C = 2, D = 1, E = 0
        switch (this.index) {
            case "A":
                return 4;
            case "AB":
                return 3.5;
            case "B":
                return 3;
            case "BC":
                return 2.5;
            case "C":
                return 2;
            case "D":
                return 1;
            case "E":
                return 0;
            default:
                return 0;
        }
    }

    public String display() {
        return kode + " - " + nama + " - " + index + " - " + "Dosen: " + dosen.getNama();
    }

    public int getSks() {
        return sks;
    }
}