package Pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123456781", "ANGGORO ARI NURCAHYO, ST.,M.Kom.");
        Dosen dosen2 = new Dosen("123456782", "DR. AYI PURBASARI, ST., MT.");
        Dosen dosen3 = new Dosen("123456783", "ADE SUKENDAR, ST.,MT.");
        Dosen dosen4 = new Dosen("123456784", "ADE SUKENDAR, ST.,MT.");
        Dosen dosen5 = new Dosen("123456785", "ERIK, ST.,M.Kom.");
        Dosen dosen6 = new Dosen("123456786", "Siroj Nur Ulum, ST., MT.");

        // Create objek MataKuliah
        MataKuliah mk1 = new MataKuliah("001", "Visualisasi Data", "A", 2, dosen1);
        MataKuliah mk2 = new MataKuliah("002", "Sistem Berorientasi Objek", "A", 3, dosen2);
        MataKuliah mk3 = new MataKuliah("003", "Rekayasa Perangkat Lunak", "B", 3, dosen3);

        MataKuliah mk4 = new MataKuliah("004", "Praktikum Pemrograman 1", "A", 3, dosen4);
        MataKuliah mk5 = new MataKuliah("005", "Praktikum Multimedia", "AB", 3, dosen5);
        MataKuliah mk6 = new MataKuliah("006", "Pemrograman Berorientasi Objek", "A", 3, dosen6);

        // Create objek KHS
        KartuHasilStudi khs1 = new KartuHasilStudi("3");
        khs1.addMataKuliah(mk1);
        khs1.addMataKuliah(mk2);
        khs1.addMataKuliah(mk3);
        khs1.hitungIPS();

        KartuHasilStudi khs2 = new KartuHasilStudi("4");
        khs2.addMataKuliah(mk4);
        khs2.addMataKuliah(mk5);
        khs2.addMataKuliah(mk6);
        khs2.hitungIPS();

        // Create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040111", "Ahmad Dzaki");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs1);
        transkrip.addKHS(khs2);
        transkrip.hitungIPK();
        transkrip.display();
    }
}

/*
Kesimpulan:
- Program ini mensimulasikan sistem akademik untuk menghitung IPS per semester dan IPK kumulatif mahasiswa.

- Pola OOP (Object-Oriented Programming) diterapkan dengan Encapsulation (penggunaan getter-setter) dan Aggregation (hubungan antara Mahasiswa, KartuHasilStudi, MataKuliah, dan Dosen).

- Output program akan menampilkan data mahasiswa, mata kuliah yang diambil, nilai, IPS, dan IPK secara lengkap.
 */