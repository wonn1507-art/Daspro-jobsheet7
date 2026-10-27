
import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 50000, jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        String ulang = "y";

        while (ulang.equalsIgnoreCase("y")) {
            System.out.print("Masukkan jumlah tiket : ");
            jumlahTiket = input.nextInt();

            while (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid (negatif)!");
                System.out.print("Masukkan jumlah tiket kembali : ");
                jumlahTiket = input.nextInt();
            }

            double subtotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 4) {
                diskon = 0.10;
            } else if (jumlahTiket > 10) {
                diskon = 0.15;
            }

            double totalBayar = subtotal - (subtotal * diskon);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Subtotal      : Rp" + subtotal);
            System.out.println("Diskon        : " + (diskon * 100) + "%");
            System.out.println("Total bayar   : Rp" + totalBayar);

            System.out.print("Input transaksi lagi? (y/n): ");
            ulang = input.next();
        }

        System.out.println("\n     REKAP PENJUALAN HARIAN      ");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp" + totalPenjualan);

        input.close();
    }
}
