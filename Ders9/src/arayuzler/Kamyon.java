package arayuzler;

public class Kamyon extends Vasita implements Karayolu {
    @Override
    void yolculukTuru() {
        System.out.println("Bu araç kara yolunu kullanmaktadır.");
    }

    @Override
    public void motorHacmi(String deger) {
        System.out.println("motorHacmi = "+deger);
    }

    @Override
    public void yakitTuru(String deger) {
        System.out.println("yakitTuru = "+deger);
    }

    @Override
    public void agirlik(String deger) {
        System.out.println("agirlik = "+deger);
    }

    @Override
    public void yolDurum() {

    }
}
