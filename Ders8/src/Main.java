public class Main {
    public static void main(String[] args) {
        /*
        Kullanici kullanici1=new Kullanici();
        kullanici1.setIsim("Huseyin Bodur");
        kullanici1.setNumara(4);
        kullanici1.setYas(20);

        System.out.println("Kullanıcının adı= "+kullanici1.getIsim());
        System.out.println("Kullanıcının yasi= "+kullanici1.getYas());
        System.out.println("Kullanıcının numarası= "+kullanici1.getNumara());
         */

        System.out.println();

        OgretimUyesi ogretimUyesi=new OgretimUyesi();
        ogretimUyesi.adiSoyadi="Hasan Can";
        ogretimUyesi.sicilNo=1234;
        System.out.println(ogretimUyesi.sicilNo+ " nolu personel "+ogretimUyesi.adiSoyadi+" nın maası= "+ ogretimUyesi.maasHesapla(2,10)+" TL'dir.");
        ogretimUyesi.dersIsleri();

        System.out.println();

        Memur memur=new Memur();
        System.out.println("Memur Maası= "+(memur.maasHesapla(4,40)));
    }
}
/*
    Tekli Kalıtım: bir alt sınıf, bir üst sınıfa baglı
    Çoklu Kalıtım: bir alt sınıf,birden fazla üst sınıftan özellik alması (interface)
    Çok Seviyeli Kalıtım: bir alt sınıf,başka bir sınıfın üst sınıfı olmasıdır
    Hiyeraşik Kalıtım: bir üst sınıfa birden fazla alt sınıfı olması
 */