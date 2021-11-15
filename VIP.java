import java.util.Scanner;

public class VIP {

    public VIP() {

    }

    public void DaftarMenu() {
        System.out.println("<=========================< DAFTAR Menu VIP >=============================>");
        System.out.println("+-------------------------------------------------------------------------+ ");
        System.out.println("|\t|No|---------------------TENTUKAN PILIHAN--------------------------| ");
        System.out.println("+-------------------------------------------------------------------------+ ");
        System.out.println("|\t|1.| D'Cost VIP.........................................|Rp.150.000|");
        System.out.println("|\t|2.| Ayam fillet asam manis.............................|Rp. 95.000|");
        System.out.println("|\t|3.| Gurame bakar.......................................|Rp. 89.000|");
        System.out.println("|\t|4.| Japanese tofu with Padang sauce....................|Rp. 75.000|");
        System.out.println("|\t|5.|Sweet and sour gourami..............................|Rp.100.000|");
        System.out.println("+-------------------------------------------------------------------------+ ");
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
                    if (nomenu < 1 || nomenu > 5) {
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

    public void DapurMenu(int noMenu) {
        System.out.println("<=========================< DAFTAR Menu VIP >==============================>");
        System.out.println("+--------------------------------------------------------------------------+ ");
        System.out.println("|\t|No|---------------------TENTUKAN PILIHAN--------------------------| ");
        System.out.println("+--|--|--------------------------------------------------------------------+");
        if (noMenu == 1) {
            System.out.println("|\t|1.| D'Cost VIP.........................................|Rp.150.000|");
        } else if (noMenu == 2) {
            System.out.println("|\t|2.| Ayam fillet asam manis.............................|Rp. 95.000|");
        } else if (noMenu == 3) {
            System.out.println("|\t|3.| Gurame bakar.......................................|Rp. 89.000|");
        } else if (noMenu == 4) {
            System.out.println("|\t|4.| Japanese tofu with Padang sauce....................|Rp. 75.000|");
        } else if (noMenu == 5) {
            System.out.println("|\t|5.| Sweet and sour gourami.............................|Rp.100.000|");
        }
        System.out.println("+--------------------------------------------------------------------------+ ");
    }

}
