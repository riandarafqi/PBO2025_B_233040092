package Pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        // Implementasi perhitungan IPK
        // Rumus: (index nilai * sks) + (index nilai * sks) + ... / total_sks

        double totalNilai = 0;
        int totalSKS = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (MataKuliah mk : khs.getDaftarMataKuliah()) {
                totalNilai += mk.nilaiIndex() * mk.getSks();
                totalSKS += mk.getSks();
            }
        }

        if (totalSKS > 0) {
            this.ipk = Math.round((totalNilai / totalSKS) * 100.0) / 100.0; // Pembulatan 2 desimal
        } else {
            this.ipk = 0;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println("Semester: " + khs.getSemester());
            System.out.println(khs.display());
        }
    }

    // Setter & Getter
    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}