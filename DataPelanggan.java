public class DataPelanggan {
    private String nama;
    private int No_meja;

    public DataPelanggan(String nama, int pelanggan) {
        this.nama = nama;
        this.No_meja = pelanggan;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPelanggan() {
        return this.No_meja;
    }

    public String toString() {
        return "nama anggota : " + nama + "\t No_meja : " + No_meja + "----...Selamat menikmati " + nama + " !\n";
    }

}
