import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	public Main() {
		ArrayList<Karyawan> data = new ArrayList<Karyawan>();
//		data.add(new Karyawan("zx-3145", "Aaron Sebastian", "Laki", "Supervisor", 6000000));
//		data.add(new Karyawan("zx-3145", "Alicia Gabrielle", "Perempuan", "Supervisor", 6000000));
//		data.add(new Karyawan("zx-3145", "Calvin Nicholas", "Laki", "Supervisor", 6000000));
//		data.add(new Karyawan("zx-3145", "Felix Jonathan", "Laki", "Manager", 565));
//		data.add(new Karyawan("zx-3145", "Herman Kuding", "Laki", "Supervisor", 6000000));
		int countManager = 0;
		int countSupervisor = 0;
		int countAdmin = 0;
		
		while(true) {
			// minta user untuk memilih dari 4 menu (insert data karyawan, view data karyawan, 
			// update data karyawan, dan delete data karyawan)
			System.out.println("Pilih opsi:");
			System.out.println("(1) Insert data karyawan");
			System.out.println("(2) View data karyawan");
			System.out.println("(3) Update data karyawan");
			System.out.println("(4) Delete data karyawan");
			
			System.out.println("countManager = " + countManager);
			System.out.println("countSupervisor = " + countSupervisor);
			System.out.println("countAdmin = " + countAdmin);
						
						
			
			
			// hitung length ArrayList
			int length = data.size();
			
			
			int menu = scan.nextInt(); scan.nextLine();
			
			
			// exit
			if(menu == 0) {
				System.out.println("Goodbye!");
				break;
			}
			
			// jika user memilih 1 (insert data karyawan)
			else if(menu == 1) {
				// minta input data untuk karyawan
				// kode karyawan terdiri dari MM-XXXX dimana MM adalah 2 huruf afabet yang di random 
				// dilanjutkan dengan 4 angka numeric yang di random (contoh : ZX-3145),
				String kode;
				System.out.println("Masukkan kode:");
				kode = scan.nextLine(); 
				// nama karyawan
				String nama;
				System.out.println("Masukkan nama karyawan:");
				nama = scan.nextLine(); 
				// jenis kelamin (Laki-Laki / Perempuan)
				String kelamin;
				System.out.println("Masukkan jenis kelamin (Laki-Laki / Perempuan) (Case Sensitive):");
				kelamin = scan.nextLine(); 
				// jabatan (Manager / Supervisor / Admin)
				String jabatan;
				System.out.println("Masukkan jabatan (Manager / Supervisor / Admin) (Case Sensitive):");
				jabatan = scan.nextLine(); 
//				Untuk gaji karyawan terdiri dari:
//					● Manager = Rp. 8 Juta.
//					● Supervisor = Rp. 6 Juta.
//					● Admin = Rp. 4 Juta.
				double gaji = 0;
				if(jabatan.equals("Manager")) {
					gaji = 8000000;
					countManager += 1;
				} else if(jabatan.equals("Supervisor")) {
					gaji = 6000000;
					countSupervisor += 1;
				} else if(jabatan.equals("Admin")) {
					gaji = 4000000;
					countAdmin += 1;
				} 
				
				
				System.out.println("data finished");
				// lalu masukkan data ke dalam arraylist karyawan
				Karyawan k1 = new Karyawan(kode, nama, kelamin, jabatan, gaji);
				data.add(k1);
				
				// bonus gaji untuk manager
				if(countManager == 3) {
					for(int i = length; i >= 0 && countManager > 0; i--) {
						if(data.get(i).getJabatan().equals("Supervisor")) {
							// increment gaji sesuai dengan persentase daftar bonus gaji karyawan
							double gajiTambahan = data.get(i).gaji * 0.075;
							data.get(i).gaji += gajiTambahan;
							countManager--;
						}
					}
				}
				
				// bonus gaji untuk supervisor
				if(countSupervisor == 3) {
					for(int i = length; i >= 0 && countSupervisor > 0; i--) {
						if(data.get(i).getJabatan().equals("Supervisor")) {
							// increment gaji sesuai dengan persentase daftar bonus gaji karyawan
							double gajiTambahan = data.get(i).gaji * 0.075;
							data.get(i).gaji += gajiTambahan;
							countSupervisor--;
						}
					}
				}
				
				// bonus gaji untuk admin
				if(countAdmin == 3) {
					for(int i = length; i >= 0 && countAdmin > 0; i--) {
						if(data.get(i).getJabatan().equals("Supervisor")) {
							// increment gaji sesuai dengan persentase daftar bonus gaji karyawan
							double gajiTambahan = data.get(i).gaji * 0.075;
							data.get(i).gaji += gajiTambahan;
							countAdmin--;
						}
					}
				}
				
				
				// sort arraylist berdasarkan nama karyawan
				data.sort((a, b) -> a.nama.compareTo(b.nama));
			}
				
			
			
			// jika user memilih 2 (view data karyawan)
			else if(menu == 2) {
				// gunakan for loop untuk print data semua karyawan dari arraylist
				System.out.printf("%-25s | %-25s | %-25s | %-25s | %-25s | %-25s\n", "No", "Kode Karyawan", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Gaji Karyawan");
				for(int i = 0; i < data.size(); i++) {
					System.out.printf("%-25s | %-25s | %-25s | %-25s | %-25s | %-25.2f\n", i+1, data.get(i).kode, data.get(i).nama, data.get(i).kelamin, data.get(i).jabatan, data.get(i).gaji);
					
				}
			}
				
			
			
			// jika user memilih 3 (update data karyawan)
			else if(menu == 3) {
				// gunakan for loop untuk print data semua karyawan (dengan nomor urutan juga)
				System.out.printf("%-25s | %-25s | %-25s | %-25s | %-25s | %-25s\n", "No", "Kode Karyawan", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Gaji Karyawan");
				for(int i = 0; i < data.size(); i++) {
					System.out.printf("%-25s | %-25s | %-25s | %-25s | %-25s | %-25f\n", i+1, data.get(i).kode, data.get(i).nama, data.get(i).kelamin, data.get(i).jabatan, data.get(i).gaji);
					
				}
				// minta user untuk pilih nomor urutan karyawan yang ingin diupdate
				System.out.println("Input nomor urutan karyawan yang ingin diupdate: ");
				int nomor = scan.nextInt(); scan.nextLine();
				// masukkan data karyawan
				for(int i = 0; i < length; i++) {
					if((i+1) == nomor) {
						
						// nama karyawan
						String nama;
						System.out.println("Masukkan nama karyawan:");
						nama = scan.nextLine(); 
						data.get(i).setNama(nama);
						
						// jenis kelamin (Laki-Laki / Perempuan)
						String kelamin;
						System.out.println("Masukkan jenis kelamin (Laki-Laki / Perempuan) (Case Sensitive):");
						kelamin = scan.nextLine(); 
						data.get(i).setKelamin(kelamin);
						
						// jabatan (Manager / Supervisor / Admin)
						String jabatan;
						System.out.println("Masukkan jabatan (Manager / Supervisor / Admin) (Case Sensitive):");
						jabatan = scan.nextLine(); 
						data.get(i).setJabatan(jabatan);
						
//						Untuk gaji karyawan terdiri dari:
//							● Manager = Rp. 8 Juta.
//							● Supervisor = Rp. 6 Juta.
//							● Admin = Rp. 4 Juta.
						double gaji = 0;
						if(jabatan.equals("Manager")) {
							gaji = 8000000;
						} else if(jabatan.equals("Supervisor")) {
							gaji = 6000000;
						} else if(jabatan.equals("Admin")) {
							gaji = 4000000;
						} 
						data.get(i).setGaji(gaji);
						
						
						System.out.println("Berhasil mengupdate karyawan dengan id " + data.get(i).kode);
					}
				}
			}
				
			
			// jika user memilih 4 (delete data karyawan)
			else if(menu == 4) {
				// gunakan for loop untuk print data semua karyawan
				System.out.printf("%-25s | %-25s | %-25s | %-25s | %-25s | %-25s\n", "No", "Kode Karyawan", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Gaji Karyawan");
				for(int i = 0; i < data.size(); i++) {
					System.out.printf("%-25s | %-25s | %-25s | %-25s | %-25s | %-25d\n", i+1, data.get(i).kode, data.get(i).nama, data.get(i).kelamin, data.get(i).jabatan, data.get(i).gaji);
					
				}
				
				// minta input nomor urutan karyawan yang ingin dihapus
				System.out.println("Input nomor urutan karyawan yang ingin dihapus: ");
				int nomor = scan.nextInt(); scan.nextLine();
				String kode = data.get(nomor-1).kode;
				
				data.remove(nomor-1);
				
				System.out.println("Karyawan dengan kode " + kode + " berhasil dihapus");
			}
				
			
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
