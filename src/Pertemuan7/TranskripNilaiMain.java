package Pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123456789", "Sandhila Galih");
        Dosen dosen2 = new Dosen("123456780", "Erik");
        Dosen dosen3 = new Dosen("123456788", "ADE SUKENDAR");
        Dosen dosen4 = new Dosen("123456787", "Tatang Sudrajat");
        Dosen dosen5 = new Dosen("123456786", "AYI PURBASARI");
        Dosen dosen6 = new Dosen("123456785", "ANGGORO ARI NURCAHYO");

        // Create objek MataKuliah
        MataKuliah mk1 = new MataKuliah("001", "Internet Of Things", "A", 2, dosen1);
        MataKuliah mk2 = new MataKuliah("002", "Multimedia", "A", 3, dosen2);
        MataKuliah mk3 = new MataKuliah("003", "Rekayasa Perangkat Lunak", "B", 3, dosen3);

        MataKuliah mk4 = new MataKuliah("004", "Agama","BC", 3, dosen4);
        MataKuliah mk5 = new MataKuliah("005", "Sistem Berorientasi Objek", "AB", 3, dosen5);
        MataKuliah mk6 = new MataKuliah("006", "Praktikum Basis Data", "A", 3, dosen6);

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
        Mahasiswa mhs = new Mahasiswa("233040092", "Muhammad Rianda Rafqi");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs1);
        transkrip.addKHS(khs2);
        transkrip.hitungIPK();
        transkrip.display();
    }
}