package ihsanudin.soal2;

public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk,String tahunKeluaran, double harga,int stok){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    public String getMerk(){
        return merk;
    }
    public String getTahunKeluaran(){
        return tahunKeluaran;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }

    void setStok(int stok){
        this.stok = stok;
    }
    void setHarga(double harga){
        this.harga = harga;
    }

    public void displayInfo(){
        System.out.println("Informasi Mobil :");
        System.out.println("Merk : " + merk);
        System.out.printf("Harga : %.1f", + harga);
        System.out.println();
        System.out.println("Tahun Keluaran : " + tahunKeluaran);
        System.out.println("Sisa Stok : " + stok);
    }
}
