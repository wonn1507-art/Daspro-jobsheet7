import java.util.Scanner;
class SiakadFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa, nilai, tertinggi = 0, terendah = 100, jumlahLulus = 0, jumlahTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMahasiswa = sc.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid!");
                i--; 
                continue;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);

        sc.close();
    }
}
