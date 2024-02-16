import java.io.File;

public class Main {
    public static void main(String[] args) {
        Main mainNesnesi = new Main();
        double donenFiyat = mainNesnesi.netFiyatHesapla(500);
        System.out.println("Net Fiyat = " + donenFiyat);

        mainNesnesi.netFiyatHesapla2(500); //voidli olan

        String konum = "C:\\Users\\iskender";
        boolean gelenCevap = mainNesnesi.dosyaKontrol(konum);
        if(gelenCevap == true)
            System.out.println("Dosya var");
        else
            System.out.println("Dosya Yok");
    }
    double netFiyatHesapla(double brutFiyat){
        double netFiyat;
        double vergi;
        vergi = brutFiyat * 0.18;
        netFiyat = brutFiyat - vergi;
        return netFiyat;
    }

    void netFiyatHesapla2(double brutFiyat){
        double netFiyat = brutFiyat - (brutFiyat * 0.18);
        System.out.println("Net Fiyat = " + netFiyat);
    }

    boolean dosyaKontrol(String konum){
        File dosyaKlasoru = new File(konum);
        if(dosyaKlasoru.exists())
            return true;
        else
            return false;
    }
    void dosyaIslemleri(String konum){
        File dosyaKlasoru = new File(konum);
        if(dosyaKlasoru.exists()) {
            File yeniIsim = new File("deneme");
            dosyaKlasoru.renameTo(yeniIsim);
        }
        else
            dosyaKlasoru.mkdir();
    }
}