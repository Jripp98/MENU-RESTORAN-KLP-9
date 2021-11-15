import java.util.Scanner;

public class Hemat extends Menu {

    public Hemat() {

    }

    public void DaftarMenu() {
        System.out.println("<=========---< DAFTAR MENU Hemat >---================>");
        System.out.println("+----------------------------------------------------+ ");
        System.out.println("|\t|No.|-------TENTUKAN PILIHAN-----------------| ");
        System.out.println("+----------------------------------------------------+ ");
        System.out.println("|\t|1.| Soto Lamongan + Nasi..........|Rp.20.000|");
        System.out.println("|\t|2.| Ayam penyet goreng............|Rp.10.000|");
        System.out.println("|\t|3.| Ayam Geprek+Nasi..............|Rp.10.000|");
        System.out.println("|\t|4.| Mie Aceh......................|Rp.10.000|");
        System.out.println("|\t|5.| Mie tiaw......................|Rp.10.000|");
        System.out.println("|\t|6.| Nasi Goreng pataya............|Rp.10.000|");
        System.out.println("|\t|7.| Kentang Goreng................|Rp. 7.000|");
        System.out.println("|\t|8.| Padang Food...................|Rp.15.000|");
        System.out.println("+----------------------------------------------------+ ");
    }

    public void pesanMenu() {
        Scanner jumlahPesanan = new Scanner(System.in);

        while (true) {
            System.out.print("apakah anda ingin memesan (y/n) : ");
            String jawaban = jumlahPesanan.nextLine();
            if (jawaban.equalsIgnoreCase("y")) {
                System.out.print("masukkan jumlah pesanan : ");
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
            System.out.print("apakah anda ingin memesan (y/n) : ");
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
        System.out.println("<==========---< DAFTAR Hemat YANG DIPESAN >---==================>");
        System.out.println("+-----------------------------------------------------------+ ");
        System.out.println("|\t|No|---------------TENTUKAN PILIHAN-----------------| ");
        System.out.println("+--|--|-----------------------------------------------------+ ");
        if (nomorMenu == 1) {
            System.out.println("|\t|1.| Soto Lamongan + Nasi.................|Rp.20.000|");
        } else if (nomorMenu == 2) {
            System.out.println("|\t|2.| Ayam penyet goreng...................|Rp.10.000|");
        } else if (nomorMenu == 3) {
            System.out.println("|\t|3.| Ayam Geprek+Nasi.....................|Rp.10.000|");
        } else if (nomorMenu == 4) {
            System.out.println("|\t|4.| Mie Aceh.............................|Rp.10.000|");
        } else if (nomorMenu == 5) {
            System.out.println("|\t|5.| Mie tiaw.............................|Rp.10.000|");
        } else if (nomorMenu == 6) {
            System.out.println("|\t|6.| Nasi Goreng pataya...................|Rp.10.000|");
        } else if (nomorMenu == 7) {
            System.out.println("|\t|7.| Kentang Goreng.......................|Rp. 7.000|");
        } else if (nomorMenu == 8) {
            System.out.println("|\t|8.| Padang Food..........................|Rp.15.000|");
        }
        System.out.println("+-----------------------------------------------------------+ ");
    }

}
