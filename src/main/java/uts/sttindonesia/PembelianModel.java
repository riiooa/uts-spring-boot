package uts.sttindonesia;

public class PembelianModel {
    private String NamaPembeli;
    private String KodePesanan;
    private String NamaPesanan;
    private int Harga;
    private int JumlahBeli;
    private double Total;
    private double Potongan;
    private double TotalKeseluruhan;
    private double UangBayar;
    private double UangKembali;

    public String getNamaPembeli() {
        return this.NamaPembeli;
    }

    public void setNamaPembeli(String NamaPembeli) {
        this.NamaPembeli = NamaPembeli;
    }

    public String getKodePesanan() {
        return this.KodePesanan;
    }

    public void setKodePesanan(String KodePesanan) {
        this.KodePesanan = KodePesanan;
    }

    public String getNamaPesanan() {
        return this.NamaPesanan;
    }

    public void setNamaPesanan(String NamaPesanan) {
        this.NamaPesanan = NamaPesanan;
    }

    public int getHarga() {
        return this.Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getJumlahBeli() {
        return this.JumlahBeli;
    }

    public void setJumlahBeli(int JumlahBeli) {
        this.JumlahBeli = JumlahBeli;
    }

    public double getTotal() {
        return this.Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getPotongan() {
        return this.Potongan;
    }

    public void setPotongan(double Potongan) {
        this.Potongan = Potongan;
    }

    public double getTotalKeseluruhan() {
        return this.TotalKeseluruhan;
    }

    public void setTotalKeseluruhan(double TotalKeseluruhan) {
        this.TotalKeseluruhan = TotalKeseluruhan;
    }

    public double getUangBayar() {
        return this.UangBayar;
    }

    public void setUangBayar(double UangBayar) {
        this.UangBayar = UangBayar;
    }

    public double getUangKembali() {
        return this.UangKembali;
    }

    public void setUangKembali(double UangKembali) {
        this.UangKembali = UangKembali;
    }

}
