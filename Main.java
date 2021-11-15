import java.util.Scanner;
/*Nama: Arif Maulana_2008107010026
* Nama: Aja Tifta Umara_2008107010089
    Kelompok 9 : MENU RESTORAN <>SEDERHANA
*/

public class Main {

    private static String namaPelanggan;
    private static int no_Meja;

    public static void DaftarMenu() {// untuk memilih menu
        Promo promo = new Promo();
        Hemat hemat = new Hemat();
        VIP vip = new VIP();
        Combo combo = new Combo();

        Scanner ragamMenu = new Scanner(System.in);
        Scanner Enter = new Scanner(System.in);
        int menu;

        do {
            clearScreen();
            hemat.jenisMenu();
            System.out.print("Masukkan inputan: ");
            menu = ragamMenu.nextInt();

            if (menu == 1) {
                clearScreen();
                vip.DaftarMenu();
                vip.pesanMenu();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 2) {
                clearScreen();
                hemat.DaftarMenu();
                hemat.pesanMenu();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 3) {
                clearScreen();
                promo.DaftarMenu();
                promo.pesanMenu();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 4) {
                clearScreen();
                combo.DaftarMenu();
                combo.pesanMenu();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 5) {
                clearScreen();
                break;
            } else {
                clearScreen();
                System.out.println("masukkan input yang benar berupa angka 1/2/3/4/5");
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }
        } while (true);

    }

    public static void pemilihanMenu() {// untuk pemilihan Menu
        Promo promo = new Promo();
        Hemat hemat = new Hemat();
        VIP vip = new VIP();
        Combo combo = new Combo();

        Scanner jenisMenu = new Scanner(System.in);
        Scanner Enter = new Scanner(System.in);
        int menu;

        do {
            clearScreen();
            combo.jenisMenu();
            System.out.print("masukkan inputan anda : ");
            menu = jenisMenu.nextInt();

            if (menu == 1) {
                clearScreen();
                combo.DaftarMenu();
                combo.pemesanan();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 2) {
                clearScreen();
                vip.DaftarMenu();
                vip.pesanMenu();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 3) {
                clearScreen();
                hemat.DaftarMenu();
                hemat.pemesanan();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 4) {
                clearScreen();
                promo.DaftarMenu();
                promo.pemesanan();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (menu == 5) {
                clearScreen();
                break;
            } else {
                clearScreen();
                System.out.println("masukkan input yang benar berupa angka 1/2/3/4/5");
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }
        } while (true);

    }

    public static void clearScreen() {// untku menghapus layar
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.err.println("Tidak bisa clear screen");
        }
    }

    /**
     * method dibawah berfungsi sebagai method utama untuk menampilkan menu dan
     * pilihan2 yang tersedia
     * 
     */

    public static void main(String[] args) {
        Scanner inputPilihan = new Scanner(System.in);
        Scanner Enter = new Scanner(System.in);
        int pilihan;

        do {
            clearScreen();
            System.out.println("+-------------------------------+ ");
            System.out.println("|\tMenu RESTORAN J2\t| ");
            System.out.println("+-------------------------------+ ");
            System.out.println("|\t1. Login\t\t|");
            System.out.println("|\t2. pilihan Menu\t\t|");
            System.out.println("|\t3. pesan ulang Menu\t|");
            System.out.println("|\t4. Exit\t\t\t|");
            System.out.println("+-------------------------------+ ");

            System.out.print("masukkan pilihan anda : ");
            pilihan = inputPilihan.nextInt();

            if (pilihan == 1) {
                Scanner data = new Scanner(System.in);
                System.out.print("\nmasukkan nama anda : ");
                namaPelanggan = data.nextLine();
                System.out.print("masukkkan NO_Meja anda : ");
                no_Meja = data.nextInt();

                DataPelanggan datapelanggan = new DataPelanggan(namaPelanggan, no_Meja);
                System.out.print("\napakah anda ingin mengubah data (y/n) : ");

                while (true) {
                    String ubah = data.next();
                    if (ubah.equalsIgnoreCase("y")) {
                        System.out.print("\nmasukkan nama anda : ");
                        namaPelanggan = data.next();
                        datapelanggan.setNama(namaPelanggan);
                        System.out.println("\n" + datapelanggan.toString());
                        break;
                    } else if (ubah.equalsIgnoreCase("n")) {
                        System.out.println("\n" + datapelanggan.toString());
                        break;
                    } else {
                        System.out.println("silahkan masukkan jawaban berupa y/n !");
                        continue;
                    }
                }
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            } else if (pilihan == 2) {
                if (namaPelanggan == null) {
                    System.out.println("\nsilahkan registrasi terlebih dahulu !");
                    System.out.print("\ntekan enter untuk lanjut...");
                    Enter.nextLine();
                    continue;
                } else {
                    DaftarMenu();
                    System.out.print("tekan enter untuk lanjut...");
                    Enter.nextLine();
                    continue;
                }
            } else if (pilihan == 3) {
                if (namaPelanggan == null) {
                    System.out.println("\nsilahkan registrasi terlebih dahulu !");
                    System.out.print("\ntekan enter untuk lanjut...");
                    Enter.nextLine();
                    continue;
                } else {
                    DaftarMenu();
                    System.out.print("tekan enter untuk lanjut...");
                    Enter.nextLine();
                    continue;
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("masukkan input yang benar berupa angka 1/2/3/4");
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }
        } while (true);

        System.out.println("<-------===============< TERIMAKASIH TELAH BERKUNJUNG >===============-------->");

        inputPilihan.close();
        Enter.close();
    }

}
