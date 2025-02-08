import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	public Main() {
		ArrayList<Karyawan> data = new ArrayList<Karyawan>();
		while(true) {
			// minta user untuk memilih dari 4 menu (insert data karyawan, view data karyawan, 
			// update data karyawan, dan delete data karyawan)
			
			
			// jika user memilih 1 (insert data karyawan)
				// minta input data untuk karyawan
				// kode karyawan terdiri dari MM-XXXX dimana MM adalah 2 huruf afabet yang di random 
				// dilanjutkan dengan 4 angka numeric yang di random (contoh : ZX-3145),
				// nama karyawan
				// jenis kelamin (Laki-Laki / Perempuan)
				// jabatan (Manager / Supervisor / Admin)
			
				// lalu masukkan data ke dalam arraylist karyawan
			
			// jika user memilih 2 (view data karyawan)
				// gunakan for loop untuk print data semua karyawan dari arraylist
			
			// jika user memilih 3 (update data karyawan)
				// gunakan for loop untuk print data semua karyawan (dengan nomor urutan juga)
				// minta user untuk pilih nomor urutan karyawan yang ingin diupdate
				// masukkan data karyawan
			
			// jika user memilih 4 (delete data karyawan)
				// gunakan for loop untuk print data semua karyawan
				// minta input nomor urutan karyawan yang ingin dihapus
			
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
