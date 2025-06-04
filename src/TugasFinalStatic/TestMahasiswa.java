package TugasFinalStatic;

//Tugas 5
public class TestMahasiswa {
 public static void main(String[] args) {
     Mahasiswa mhs1 = new Mahasiswa("12345", "Alice");
     Mahasiswa mhs2 = new Mahasiswa("67890", "Bob");
     Mahasiswa mhs3 = new Mahasiswa("54321", "Charlie");

     mhs1.displayInfo();
     mhs2.displayInfo();
     mhs3.displayInfo();

     System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
     System.out.println("Maksimal SKS: " + Mahasiswa.getMaxSks());
 }
}