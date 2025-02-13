
public class Karyawan {
	String kode;
	String nama;
	String kelamin;
	String jabatan;
	float gaji;
	
	public Karyawan(String kode, String nama, String kelamin, String jabatan, int gaji) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.kelamin = kelamin;
		this.jabatan = jabatan;
		this.gaji = gaji;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKelamin() {
		return kelamin;
	}

	public void setKelamin(String kelamin) {
		this.kelamin = kelamin;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
	
}
