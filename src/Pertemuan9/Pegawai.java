package Pertemuan9;

public class Pegawai {
    protected String nama;
    protected String nip;

    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
    }
}
