package TugasPBO;

public class Dosen {
	 private String NIDN;
	    private String nama;

	    public Dosen() {}

	    public Dosen(String NRP, String nama) {
	        this.NIDN = NIDN;
	        this.nama = nama;
	    }

	    public String display() {
	        return "NRP: " + NIDN + ", nama: " + nama;
	    }

	    /* Setter & Getter */

	    public String getNRP() {
	        return NIDN;
	    }

	    public void setNRP(String NRP) {
	        this.NIDN = NRP;
	    }

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }
	}

