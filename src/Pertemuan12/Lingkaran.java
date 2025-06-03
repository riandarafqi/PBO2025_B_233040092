package Pertemuan12;


//Kelas Konkret (Spesialisasi)
class Lingkaran extends Bentuk {
private double radius;

public Lingkaran(double radius) {
   this.radius = radius;
}

@Override
public double hitungLuas() {
   return Math.PI * radius * radius;
}

@Override
public double hitungKeliling() {
   return 2 * Math.PI * radius;
	}
}