package Pertemuan12;


//Kelas Konkret lainnya (misal, Persegi, untuk memperjelas polymorphism)
class Persegi extends Bentuk {
private double sisi;

public Persegi(double sisi) {
 this.sisi = sisi;
}

@Override
public double hitungLuas() {
 return sisi * sisi;
}

@Override
public double hitungKeliling() {
 return 4 * sisi;
	}
}