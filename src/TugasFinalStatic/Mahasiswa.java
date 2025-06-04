package TugasFinalStatic;

//Tugas 5
public class Mahasiswa {
 final String nim;
 String nama;
 static int totalMahasiswa = 0;
 static final int MAX_SKS = 24;
 static {
     System.out.println("Inisialisasi kelas Mahasiswa");
 }
 public Mahasiswa(String nim, String nama) {
     this.nim = nim;
     this.nama = nama;
     totalMahasiswa++;
     System.out.println("Mahasiswa baru ditambahkan: " + nama + " (NIM: " + nim + ")");
 }

 public String getNim() {
     return nim;
 }
 public String getNama() {
     return nama;
 }
 public static int getTotalMahasiswa() {
     return totalMahasiswa;
 }
 public static int getMaxSks() {
     return MAX_SKS;
 }
 public void displayInfo() {
     System.out.println("NIM: " + nim + ", Nama: " + nama + 
                        ", Maksimal SKS: " + MAX_SKS);
 }
}