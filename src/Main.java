import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        DataMahasiswa mahasiswa=new DataMahasiswa();
        System.out.println("Selamat datang di Pembukuan Mahasiswa!");
        do {
        System.out.println("1. Input Mahasiswa\n2. Tampil Mahasiswa\n3. Ganti Mahasiswa\n4. Cari Mahasiwa\n5. Hapus Mahasiswa");
        Scanner sc=new Scanner(System.in);

            System.out.println("Masukkan Pilihan");
            int pil = sc.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Ingin mengisi berapa mahasiswa?");
                    int total = sc.nextInt();
                    for (int i = 0; i < total; i++) {
                        System.out.println("Kode: ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nama: ");
                        String namaMahasiswa = sc.nextLine();
                        System.out.println("NPM: ");
                        String npm = sc.nextLine();
                        mahasiswa.tambahMahasiswa(new Mahasiswa(kode, namaMahasiswa, npm));
                    }
                    System.out.flush();
                    //new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
                    break;
                case 2:
                    int kode = mahasiswa.tampilMahasiswa();
                    if (kode == 0) {
                        System.out.println("Data Kosong!");
                    }
                    break;
                case 3:
                    System.out.println("Masukkan Kode Mahasiswa: ");
                    int kode1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ganti nama Mahasiswa Menjadi: ");
                    String updateNamaMahasiswa = sc.nextLine();
                    System.out.println("Ganti NPM Menjadi: ");
                    String updateNPM = sc.nextLine();
                    mahasiswa.updateMahasiswa(kode1, updateNamaMahasiswa, updateNPM);
                    break;
                case 4:
                    int kode2;
                    System.out.println("Masukkan Kode Mahasiswa: ");
                    kode2 = sc.nextInt();
                    mahasiswa.cariMahasiswa(kode2);
                    break;
                case 5:
                    System.out.println("Masukkan Kode Mahasiswa yang ingin dihapus: ");
                    int kode3 = sc.nextInt();
                    mahasiswa.hapusMahasiswa(kode3);
                    System.out.println("data mahasiswa berhasil dihapus!");
                    break;
                default:
                    System.out.println("Kode yang dimasukkan salah!");
                    break;

            }

        }while (true);

    }
}
