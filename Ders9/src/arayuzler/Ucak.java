package arayuzler;

public class Ucak extends Vasita implements Havayolu {
    @Override
    void yolculukTuru() {
        System.out.println("Bu araç hava yolunu kullanmaktadır.");
    }

    @Override
    public void kanatAcikligi(int deger) {
        System.out.println("kanatAcikligi = "+deger);
    }

    @Override
    public void ucusMenzili(int deger) {
        System.out.println("ucusMenzili = "+deger);
    }

    @Override
    public void uzunluk(int deger) {
        System.out.println("uzunluk = "+deger);
    }

    @Override
    public void yolDurum(int deger) {

    }
}
