public class Nokia3310 extends CepTelefonu{
    Nokia3310(){
        System.out.println("Nokia3310 Sınıfı Yapılandırıcısı");
    }

    void TakozOzelligi(){
        System.out.println("Dilerseniz takoz olarak kullanabilirsiniz");
    }

    @Override
    void ZilSesi() {
        System.out.println("Sadece polifonik ses tipinde zil sesi olabilir");
    }

    @Override
    void Oyunlar(String oyunTuru) {
        System.out.println(oyunTuru+" oyunu oynanabilir.");
    }
}
