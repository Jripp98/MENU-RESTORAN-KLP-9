/**
 * class bukuu merupakan class absrak class ini merupakan class induk dari class
 * : Biografi Ensiklopedia Kamus Novel Sejarah
 * 
 */

public abstract class Menu {

        public Menu() {

        }

        public void jenisMenu() {
                System.out.println(
                                "<==========================================================================================>");
                System.out.println(
                                "<========================---< SELAMAT DATANG DI RESTORAN J2 >---===========================>");
                System.out.println(
                                "<========================---< DAN SELAMAT MENIKMATI MAKANANNYA >---========================>");
                System.out.println(
                                "<==========================================================================================>\n");
                System.out.println("+-------------------------------+ ");
                System.out.println("|\tJenis-jenis Menu\t| ");
                System.out.println("+-------------------------------+ ");
                System.out.println("|\t1. VIP\t\t\t|");
                System.out.println("|\t2. Hemat\t\t|");
                System.out.println("|\t3. Promo\t\t|");
                System.out.println("|\t4. Combo\t\t|");
                System.out.println("|\t5. Kembali\t\t|");
                System.out.println("+-------------------------------+ ");
        }

        public abstract void DaftarMenu();

        public abstract void pesanMenu();

        public abstract void DapurMenu(int nomenu);

        public abstract void pemesanan();

}
