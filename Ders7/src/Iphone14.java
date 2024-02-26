public class Iphone14 extends CepTelefonu {
    Iphone14(){
        System.out.println("Iphone14 Sınıfı Yapılandırıcısı");
    }

    void InterneteBaglan(String internetAdresi){
        System.out.println("Bağlanılan site = "+internetAdresi);
    }

    @Override
    void ZilSesi() {
        System.out.println("Her ses tipinde zil sesi olabilir");
    }

    @Override
    void Oyunlar(String oyunTuru) {
        System.out.println(oyunTuru+" oyunu oynanabilir.");
    }
}
