package arayuzler;

public class Gemi extends Vasita implements Denizyolu {
    @Override
    void yolculukTuru() {
        System.out.println("Bu araç deniz yolunu kullanmaktadır.");
    }

    @Override
    public void kamaraSayisi(int sayi) {
        System.out.println("Kamara Sayisi = "+sayi);
    }

    @Override
    public void sevkSistemi(String deger) {
        System.out.println("Sevk Sistemi = "+deger);
    }

    @Override
    public void kullanimTuru(String deger) {
        System.out.println("Kullanim Turu = "+deger);
    }
}
