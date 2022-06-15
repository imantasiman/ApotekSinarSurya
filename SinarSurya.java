import java.util.Scanner;

public class SinarSurya {

    public static void main(String[] args) {
        // Masukan scanner yang diperlukan untuk menampilkan input keyboard
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        // Deklarasi variable dan arraylist
        int bayar, kmbli, x;
        String barang[];
        int harga[], jumlah[], biaya[], total = 0;
        barang = new String[5];
        harga = new int[5];
        jumlah = new int[5];
        biaya = new int[5];

        // Tampilan awal inputan
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║            APOTEK SINAR SURYA           ║");
        System.out.println("║                   Kasir                 ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.print("Masukkan Data Yang Akan Dimasukan : ");
        x = input.nextInt();

        // Perulangan For dan inputan data barang
        for (int a = 0; a < x; a++) {
            System.out.print("");
            System.out.println("==========================================");
            System.out.print("Masukkan nama barang  : ");
            barang[a] = input.next();
            System.out.print("Masukkan harga barang : ");
            harga[a] = in.nextInt();
            System.out.print("Masukkan jumlah barang: ");
            jumlah[a] = in.nextInt();
            biaya[a] = harga[a] * jumlah[a];
            System.out.println("Biaya yang harus dibayar: Rp." + biaya[a]);
            total = total + biaya[a];
        }

        // Tampilan Output
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t╔════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║           APOTEK SINAR SURYA           ║");
        System.out.println("\t\t\t\t\t\t║                  Kasir                 ║");
        System.out.println("\t\t\t\t\t\t╚════════════════════════════════════════╝");
        System.out.println("\t\t\t\t\t\t╔════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║Barang\t\t Harga \t\tJumlah\t ║");
        System.out.println("\t\t\t\t\t\t║════════════════════════════════════════║");
        for (int b = 0; b < x; b++) {
            System.out.println("\t\t\t\t\t\t║" + barang[b] + "\t\t " + harga[b] + "\t\t " + jumlah[b] + "\t ║");
        }
        System.out.println("\t\t\t\t\t\t╚════════════════════════════════════════╝");
        System.out.println("\t\t\t\t\t\tTotal biaya :Rp. " + total);
        System.out.print("\t\t\t\t\t\tPembayaran  :Rp. ");
        bayar = in.nextInt();

        // Percabangan If Else untuk menentukan pembayaran
        if (bayar < total) {
            System.out.println("");
            System.out.println("\t\t\t\t\t\t        !!UANG ANDA TIDAK CUKUP!!        ");
        } else {
            kmbli = bayar - total;
            System.out.println("\t\t\t\t\\ttKembalian   : Rp. " + kmbli);
            System.out.println("");
            System.out.println("\t\t\t\t\t               TERIMA KASIH              ");
            System.out.println("\t\t\t\t\t           SEMOGA LEKAS SEMBUH           ");
        }
    }
}