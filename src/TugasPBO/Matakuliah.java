package TugasPBO;

public class Matakuliah {
    private String kode;
    private String nama;
    private String nilai;
    private int sks;

    public Matakuliah(String kode, String nama, String nilai, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilai = nilai;
        this.sks = sks;
    }

    public String display() {
        return kode + " - " + nama + " - " + nilai + " - " + sks;
    }

    public double getNilaiIndex() {
        switch(nilai) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public int getSks() {
        return sks;
    }

    /* Setter & Getter lainnya */
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}