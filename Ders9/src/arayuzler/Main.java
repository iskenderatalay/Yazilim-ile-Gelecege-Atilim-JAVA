package arayuzler;

public class Main {
    public static void main(String[] args) {
        /*
        Normal Sınıf=>Gövdeli metotlar bulunur.
                    =>Nesnesi oluşturulabilir.
                    =>public,private,protected kullanılabilir.
        Soyut Sınıf=>Hem gövdeli hem de gövdesiz metotlar bulunabilir.
                   =>Nesnesi oluşturulamaz.
                   =>100 tane gövdeli metotun olsun 1 tane bile gövdesiz metot tanımlayacaksan o sınıf soyut tanımlanmak zorundadır.
                   =>public,private,protected kullanılabilir.
        Arayüz=>Sadece gövdesiz metotlar tanımlanabilir.
              =>Sadece public kullanılabilir.
              =>Nesnesi oluşturulamaz.
              =>Bir sınıf yanlızca bir üst sınıfa bağlanabilirken(extends),birden fazla arayüzden özellik alabilir(implement).
         */

        Kamyon bmc=new Kamyon();
        bmc.hizGoster(80);
        bmc.yolcuKapasitesi(3);
        bmc.yolculukTuru();
        bmc.agirlik("3 ton");
        bmc.motorHacmi("cc");
        bmc.yakitTuru("mazot");

        System.out.println();

        Ucak boing=new Ucak();
        boing.hizGoster(700);
        boing.yolcuKapasitesi(250);
        boing.yolculukTuru();
        boing.kanatAcikligi(15);
        boing.uzunluk(30);
        boing.ucusMenzili(1500);

        System.out.println();

        Gemi cruise=new Gemi();
        cruise.hizGoster(120);
        cruise.yolcuKapasitesi(500);
        cruise.yolculukTuru();
        cruise.kamaraSayisi(50);
        cruise.sevkSistemi("motorlu pervaneli");
        cruise.kullanimTuru("turistik");

        YuruyenUcak yuruyenUcak=new YuruyenUcak();
        yuruyenUcak.yolDurum();
    }
}