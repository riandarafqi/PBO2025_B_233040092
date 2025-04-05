package Pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah matakuliah) {
        daftarMataKuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMataKuliah) {
            sb.append(mk.display()).append("\n");
        }
        sb.append("IPS: ").append(ips).append("\n");
        return sb.toString();
    }

    public void hitungIPS() {
        // Implementasi perhitungan IPS
        double totalNilai = 0;
        int totalSKS = 0;

        for (MataKuliah mk : daftarMataKuliah) {
            totalNilai += mk.nilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }

        if (totalSKS > 0) {
            ips = Math.floor((totalNilai / totalSKS) * 100) / 100;
        } else {
            ips = 0;
        }
    }

    /* Setter & Getter */
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
}
