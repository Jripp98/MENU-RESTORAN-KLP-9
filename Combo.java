import java.util.Scanner;

public class Combo extends Menu {

    public Combo() {

    }

    public void DaftarMenu() {
        System.out.println("<====================---< DAFTAR Menu Combo >---=========================>");
        System.out.println("+------------------------------------------------------------------------+ ");
        System.out.println("|\t|No|>>>>>>>>>>>>>>>>>>>>> PILIH MENU <<<<<<<<<<<<<<<<<<<<<<<<<<<<| ");
        System.out.println("+--|--|------------------------------------------------------------------+ ");
        System.out.println("|\t|1.|Paket KFC omega + cola.............................|Rp.30.000|");
        System.out.println("|\t|2.|Paket Big Burger + lemon Drink.....................|Rp.35.000|");
        System.out.println("|\t|3.|Pizza Hut Big Large + all Juice....................|Rp.40.000|");
        System.out.println("+------------------------------------------------------------------------+ ");

    }

    public void pesanMenu() {
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
                    if (nomenu < 1 || nomenu > 6) {
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
                System.out.print("masukkan jumlah pengembalian : ");
                int banyakMenu = jumlahPesanan.nextInt();

                for (int i = 0; i < banyakMenu; i++) {
                    System.out.print("masukkan nomor Menu : ");
                    int nomenu = jumlahPesanan.nextInt();
                    if (nomenu < 1 || nomenu > 6) {
                        System.out.println("silahkan masukkan inputan sesuai nomor Menu yang tersedia !");
                        i--;
                        continue;
                    }
                    DapurMenu(nomenu);
                }

            } else {
                System.out.println("silahkan masukkan inputan yang benar berupa y/n !");
            }
        }
    }

    public void DapurMenu(int nomorMenu) {
        System.out.println("<=============---< DAFTAR Menu Combo YANG DIPILIH >---======================>");
        System.out.println("+---------------------------------------------------------------------------+ ");
        System.out.println("|\t|No|>>>>>>>>>>>>>>>>>>>>>>> PILIHAN <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<| ");
        System.out.println("+--|--|---------------------------------------------------------------------+ ");
        if (nomorMenu == 1) {
            System.out.println("|\t|1.|Paket KFC omega + cola............................|Rp.30.000|");
        } else if (nomorMenu == 2) {
            System.out.println("|\t|2.|Paket Big Burger + lemon Drink....................|Rp.35.000|");
        } else if (nomorMenu == 3) {
            System.out.println("|\t|3.|Pizza Hut Big Large + all Juice...................|Rp.40.000|");
        }
        System.out.println("+---------------------------------------------------------------------------+ ");

    }
}
