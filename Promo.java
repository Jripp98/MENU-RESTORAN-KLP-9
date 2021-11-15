import java.util.Scanner;

public class Promo extends Menu {

    public Promo() {

    }

    public void DaftarMenu() {
        System.out.println("<===========================---< DAFTAR MENU PROMO >---==========================>");
        System.out.println("+--------------------------------------------------------------------------------+ ");
        System.out.println("|\t|No|---------------------------TENTUKAN PILIHAN--------------------------| ");
        System.out.println("+--------------------------------------------------------------------------------+ ");
        System.out.println("|\t|1.| Soto Tangkar + Nasi + telur asin..........................|Rp.36.000|");
        System.out.println("|\t|2.| Ayam penyet goreng........................................|Rp.15.000|");
        System.out.println("|\t|3.| Lele Penyet+Nasi..........................................|Rp.20.000|");
        System.out.println("|\t|4.| Mie komplite..............................................|Rp.20.000|");
        System.out.println("|\t|5.| Prawn Mie.................................................|Rp.38.000|");
        System.out.println("|\t|6.| Nasi Goreng Supreme.......................................|Rp.38.000|");
        System.out.println("|\t|7.| Lamien Goreng with shrimp sauce...........................|Rp.32.000|");
        System.out.println("|\t|8.| Padang Food...............................................|Rp.15.000|");
        System.out.println("+---------------------------------------------------------------------------------+ ");
    }

    public void pesanMenu() {
        Scanner jumlahPesanan = new Scanner(System.in);

        while (true) {
            System.out.print("apakah anda ingin memesan (y/n) : ");
            String jawaban = jumlahPesanan.nextLine();
            if (jawaban.equalsIgnoreCase("y")) {
                System.out.print("masukkan jumlah pinjamana : ");
                int banyakMenu = jumlahPesanan.nextInt();

                for (int i = 0; i < banyakMenu; i++) {
                    System.out.print("masukkan nomor Menu : ");
                    int nomenu = jumlahPesanan.nextInt();
                    if (nomenu < 1 || nomenu > 8) {
                        System.out.println("silahkan masukkan inputan sesuai nomor Menu yang tersedia !");
                        i--;
                        continue;
                    }
                    DapurMenu(nomenu);
                }
                break;
            } else if (jawaban.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("silahkan masukkan inputan yang benar berupa y/n !");
            }
        }
    }

    public void pemesanan() {
        Scanner jumlahPesanan = new Scanner(System.in);

        while (true) {
            System.out.print("apakah anda ingin mengembalikan (y/n) : ");
            String jawaban = jumlahPesanan.nextLine();
            if (jawaban.equalsIgnoreCase("y")) {
                System.out.print("masukkan jumlah pemesanan : ");
                int banyakMenu = jumlahPesanan.nextInt();

                for (int i = 0; i < banyakMenu; i++) {
                    System.out.print("masukkan nomor Menu : ");
                    int nomenu = jumlahPesanan.nextInt();
                    if (nomenu < 1 || nomenu > 8) {
                        System.out.println("silahkan masukkan inputan sesuai nomor Menu yang tersedia !");
                        i--;
                        continue;
                    }
                    DapurMenu(nomenu);
                }
            }
        }
    }

    public void DapurMenu(int nomorMenu) {
        System.out.println("<==========================---< DAFTAR Promo YANG DIPESAN >---==================>");
        System.out.println("+-------------------------------------------------------------------------------+ ");
        System.out.println("|\t|No|---------------------------TENTUKAN PILIHAN--------------------------| ");
        System.out.println("+--|--|-------------------------------------------------------------------------+ ");
        if (nomorMenu == 1) {
            System.out.println("|\t|1.| Soto Tangkar + Nasi + telur asin..........................|Rp.36.000|");
        } else if (nomorMenu == 2) {
            System.out.println("|\t|2.| Ayam penyet goreng........................................|Rp.15.000|");
        } else if (nomorMenu == 3) {
            System.out.println("|\t|3.| Lele Penyet+Nasi..........................................|Rp.20.000|");
        } else if (nomorMenu == 4) {
            System.out.println("|\t|4.| Mie komplite..............................................|Rp.20.000|");
        } else if (nomorMenu == 5) {
            System.out.println("|\t|5.| Prawn Mie.................................................|Rp.38.000|");
        } else if (nomorMenu == 6) {
            System.out.println("|\t|6.| Nasi Goreng Supreme.......................................|Rp.38.000|");
        } else if (nomorMenu == 7) {
            System.out.println("|\t|7.| Lamien Goreng with shrimp sauce...........................|Rp.32.000|");
        } else if (nomorMenu == 8) {
            System.out.println("|\t|8.| Padang Food...............................................|Rp.15.000|");
        }
        System.out.println("+-------------------------------------------------------------------------------+ ");
    }

}
