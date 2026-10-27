
import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("     PROGRAM PARKIR KENDARAAN     ");
            System.out.println("1 : Mobil");
            System.out.println("2 : Motor");
            System.out.println("0 : Keluar");
            System.out.print("Masukkan jenis kendaraan : ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam) : ");
                durasi = input.nextInt();

                if (durasi < 0) {
                    System.out.println("Durasi tidak boleh negatif!");
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }

                    System.out.println("Biaya parkir kendaraan: Rp." + (jenis == 1? durasi * 3000 : durasi * 2000));
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("\n     TOTAL PARKIR      ");
        System.out.println("Total pembayaran : Rp" + total);

        input.close();
    }
}
