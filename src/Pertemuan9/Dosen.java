package Pertemuan9;

public class Dosen extends Pegawai {
    private String matkul;

    public Dosen(String nama, String nip, String matkul) {
        super(nama, nip);
        this.matkul = matkul;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Mata Kuliah: " + matkul);
    }
}