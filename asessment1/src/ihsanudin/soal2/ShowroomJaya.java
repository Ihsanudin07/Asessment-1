package ihsanudin.soal2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowroomJaya {

    static Scanner masukan = new Scanner(System.in);
    private static ArrayList<Mobil> arrMobil = new ArrayList<>();

    //membuat method tambah mobil
    static void tambahMobil(){
        System.out.println("Tambah Mobil di Showroom Jaya");
        System.out.println();
        System.out.print("Merk : ");
        String merk = masukan.next();
        System.out.print("Harga : ");
        double harga = masukan.nextDouble();
        System.out.print("Tahun Keluaran : ");
        String tahunKeluaran = masukan.next();
        System.out.print("Jumlah Stok : ");
        int stok = masukan.nextInt();

        Mobil mbl = cekMobil(merk, tahunKeluaran);
        //membuat perulangan agar tidak ada yang input mobil yang sama
        if ( mbl != null){
            System.out.println("Mobil sudah ada di showroom mobil jaya");
        }else {
            Mobil x = new Mobil(merk, tahunKeluaran, harga, stok);
            arrMobil.add(x);
            System.out.println("Mobil berhasil ditambahkan pada showroom mobil jaya");
        }
    }

    static Mobil cekMobil(String merk, String tahunKeluaran){
        Mobil x = null;
        for (Mobil mbl : arrMobil){
            if (mbl.getMerk().equalsIgnoreCase(merk)&& mbl.getTahunKeluaran().equalsIgnoreCase(tahunKeluaran)){
                x = mbl;
            }
        }
        return x;
    }

    static void beliMobil(){
        System.out.println("Beli MObil di Showroom Jaya");
        System.out.println();
        System.out.print("Merk : ");
        String merk = masukan.next();
        System.out.print("Tahun keluaran : ");
        String tahunKeluaran = masukan.next();
        System.out.print("Jumlah Beli : ");
        int jumlahBeli = masukan.nextInt();

        Mobil mbl = cekMobil(merk, tahunKeluaran);
        if (mbl.getStok() < jumlahBeli){
            System.out.println("Maaf, Jumlah Stok Tidak Mencukupi");
        }else if (mbl == null){
            System.out.println("Mobil tidak ada di showroom jaya");
        }else {
            System.out.println("Merk : " + mbl.getMerk());
            System.out.printf("Harga Satuan : %.1f", + mbl.getHarga());
            System.out.println();
            System.out.println("Tahun Keluaran : " + mbl.getTahunKeluaran());
            System.out.println("Jumlah Beli : " + jumlahBeli);

            if (jumlahBeli == 1){
                System.out.printf("Total harga : %.1f ", + mbl.getHarga() * jumlahBeli);
                System.out.println();
                System.out.println("Diskon : 0.0 persen");
                System.out.println("Total Diskon : 0");
                System.out.printf("Total bayar : %.1f ", + mbl.getHarga() * jumlahBeli);
            }else if(jumlahBeli == 2){
                double totdiskon = ((mbl.getHarga() * jumlahBeli) * 10/100);
                double totbayar = ((mbl.getHarga() * jumlahBeli)-totdiskon);
                System.out.printf("Total harga : %.1f ", + mbl.getHarga() * jumlahBeli);
                System.out.println();
                System.out.println("Diskon : 10.0 persen");
                System.out.printf("Total diskon : %.1f ", + totdiskon);
                System.out.println();
                System.out.printf("Total bayar : %.1f ", + totbayar);
            }else {
                double totdiskon1 = ((mbl.getHarga() * jumlahBeli) * 20/100);
                double totbayar1 = ((mbl.getHarga() * jumlahBeli)-totdiskon1);
                System.out.printf("Total harga : %.1f ", + mbl.getHarga() * jumlahBeli);
                System.out.println();
                System.out.println("Diskon : 20.0 persen");
                System.out.printf("Total diskon : %.1f ", + totdiskon1);
                System.out.println();
                System.out.printf("Total bayar : %.1f ", + totbayar1);
            }
            // untuk mengupdate stok yang tersedia
            mbl.setStok(mbl.getStok()-jumlahBeli);
            //menghapus mobil jika stok kosong/0
            if (mbl.getStok() == 0){
                arrMobil.removeIf(x -> x.getMerk().equalsIgnoreCase(merk));
            }
        }
    }

    static void viewStok(){
        for (Mobil mbl : arrMobil){
            mbl.displayInfo();
        }
    }


    public static void main(String[] args) {
        int menuShowroom;
        do {
            System.out.println();
            System.out.println("Pilihan Menu Showroom Jaya");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Beli Mobil");
            System.out.println("3. View Stok");
            System.out.println("4. KELUAR");

            menuShowroom = masukan.nextInt();

            switch (menuShowroom){
                case 1:
                    tambahMobil();
                    break;
                case 2:
                    beliMobil();
                    break;
                case 3:
                    viewStok();
                    break;
                case 4:
                    System.out.println("Berhasil Keluar");
                    break;
            }
        }while (menuShowroom !=4);
    }
}
