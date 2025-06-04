package TugasFinalStatic;

public class StaticFinalDemo {
    // Static final variable (constant)
    public static final double PI = 3.14159;

    // Static method
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Nilai PI: " + StaticFinalDemo.PI);
        int hasil = StaticFinalDemo.tambah(5, 7);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}