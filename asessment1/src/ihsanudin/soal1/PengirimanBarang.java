package ihsanudin.soal1;

public class PengirimanBarang {
    private String namaPengirim;
    private String namePenerima;
    private String nameDropshipper;
    private String alamatPengirim;
    private String alamatPenerima;
    private String alamatDropshipeer;
    private String dropshipeer;
    private String namaEkspedisi;
    private String noResi;
    private String noTransaksi;
    private double ongkosKirim;
    private double asuransi;


    //konstuktor untuk data utama saja
    public PengirimanBarang(String noTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namePengirim, String alamatPengirim, String namePenerima, String alamatPenerima){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPengirim = "Eiger";
        this.alamatPengirim = "Bandung Kopo";
        this.namePenerima = namePenerima;
        this.alamatPenerima = alamatPenerima;
    }

    //konstuktor untuk data utama + data asuransi
    public PengirimanBarang(String noTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namePengirim, String alamatPengirim, String namePenerima, String alamatPenerima, double asuransi){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPengirim = "Eiger";
        this.alamatPengirim = "Bandung Kopo";
        this.namePenerima = namePenerima;
        this.alamatPenerima = alamatPenerima;
        this.asuransi = asuransi;

    }

    //konstuktor untuk data utama + data dropshipper
    public PengirimanBarang(String noTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namePengirim, String alamatPengirim,String nameDropshipper, String alamatDropshipeer, String namePenerima, String alamatPenerima, String dropshipeer) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPengirim = "Eiger";
        this.alamatPengirim = "Bandung Kopo";
        this.nameDropshipper = nameDropshipper;
        this.alamatDropshipeer = alamatDropshipeer;
        this.namePenerima = namePenerima;
        this.alamatPenerima = alamatPenerima;
        this.dropshipeer = dropshipeer;
    }

    //konstuktor untuk data utama + data asuransi + data dropshipper
    public PengirimanBarang(String noTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namePengirim, String alamatPengirim,String nameDropshipper, String alamatDropshipeer, String namePenerima, String alamatPenerima,double asuransi, String dropshipeer) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPengirim = "Eiger";
        this.alamatPengirim = "Bandung Kopo";
        this.nameDropshipper = nameDropshipper;
        this.alamatDropshipeer = alamatDropshipeer;
        this.namePenerima = namePenerima;
        this.alamatPenerima = alamatPenerima;
        this.asuransi = asuransi;
        this.dropshipeer = dropshipeer;
    }

    public void Output(){
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedidi : " +namaEkspedisi);
        if ((ongkosKirim > 20000 && asuransi > 0) && dropshipeer == null){
            ongkosKirim -= 5000;
        }
        System.out.println("Ongkos Kirim : " +ongkosKirim);
        switch (String.valueOf(nameDropshipper)){
            case  "null" :
                System.out.println("Nama Pengirim : " + namaPengirim );
                break;
            default:
                System.out.println("nama Pengirim : " + nameDropshipper);
                break;
        }

        switch (String.valueOf(alamatDropshipeer)){
            case "null" :
                System.out.println("Alamat Pengirim : " + alamatPengirim);
                break;
            default:
                System.out.println("Alamat Pengirim : " + alamatDropshipeer);
                break;
        }
        System.out.println("Nama Penerima : " +namePenerima);
        System.out.println("Alamat Penerima : " +alamatPenerima);
        if (asuransi > 0){
            System.out.println("Nominal Asuransi : " +asuransi);
        }
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {

        PengirimanBarang normal = new PengirimanBarang("3","N0004","Pos Indonesia",23000,"Eiger","Bandung Kopo","Bambang","DayeuhKolot");
        PengirimanBarang asuransi = new PengirimanBarang("2","N0003","J&T",21000,"Eiger","Bandung Kopo","Tini","DayeuhKolot",40000);
        PengirimanBarang dropshipper = new PengirimanBarang("4","N0002","siCepat",24000,"Eiger","Bandung Kopo","Dropship2","Pontianak","joko","DayeuhKolot","iya");
        PengirimanBarang asuransidandropshipper = new PengirimanBarang("1","N0001","JNE",21000,"Eiger","Bandung Kopo","Dropship1","Surabaya","Bejo","DayeuhKolot",40000,"iya");

        System.out.println("Normal");
        normal.Output();
        System.out.println("Asuransi");
        asuransi.Output();
        System.out.println("Dropshipper");
        dropshipper.Output();
        System.out.println("Asuransi dan Dropshipper");
        asuransidandropshipper.Output();

    }
}
