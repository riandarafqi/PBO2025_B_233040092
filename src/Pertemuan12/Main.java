package Pertemuan12;

public class Main {
    public static void main(String[] args) {
        // Mendeklarasikan variabel bertipe Bentuk (tipe generalisasi)
        Bentuk myLingkaran = new Lingkaran(5.0); // Objek sebenarnya adalah Lingkaran
        Bentuk myPersegi = new Persegi(4.0);     // Objek sebenarnya adalah Persegi

        // Menggunakan polymorphism: memanggil method yang sama
        // pada objek yang berbeda, tetapi perilaku spesifiknya
        // ditentukan oleh tipe objek saat runtime.

        System.out.println("--- Data Lingkaran ---");
        System.out.println("Luas Lingkaran: " + myLingkaran.hitungLuas());       // Memanggil hitungLuas() dari Lingkaran
        System.out.println("Keliling Lingkaran: " + myLingkaran.hitungKeliling()); // Memanggil hitungKeliling() dari Lingkaran

        System.out.println("\n--- Data Persegi ---");
        System.out.println("Luas Persegi: " + myPersegi.hitungLuas());         // Memanggil hitungLuas() dari Persegi
        System.out.println("Keliling Persegi: " + myPersegi.hitungKeliling());   // Memanggil hitungKeliling() dari Persegi

        System.out.println("\n--- Menggunakan Array Bentuk (contoh polymorphism lebih lanjut) ---");
        Bentuk[] daftarBentuk = new Bentuk[3];
        daftarBentuk[0] = new Lingkaran(3.0);
        daftarBentuk[1] = new Persegi(6.0);
        daftarBentuk[2] = new Lingkaran(2.5); // Contoh lain Lingkaran

        for (Bentuk b : daftarBentuk) {
            System.out.println("\nMemproses bentuk baru:");
            System.out.println("Luas: " + b.hitungLuas());
            System.out.println("Keliling: " + b.hitungKeliling());
            // Di sini, b adalah tipe Bentuk, tetapi method yang dipanggil
            // adalah implementasi spesifik dari Lingkaran atau Persegi
            // pada saat runtime.
        }
    }
}