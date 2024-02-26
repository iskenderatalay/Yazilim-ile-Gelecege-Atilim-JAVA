public class Main {
    public static void main(String[] args) {
        /*
        Ogrenci ogrenciObj=new Ogrenci();
        Ogrenci ogrenciObj2=new Ogrenci(2);
         */

        /*
        Daire daireObj=new Daire();
        System.out.println(daireObj.alanHesapla());

        daireObj=new Daire(5);
        System.out.println(daireObj.alanHesapla());

        daireObj=new Daire(4,3.14);
        System.out.println(daireObj.alanHesapla());
         */

        /*
        Dikdortgen dikdortgenObj=new Dikdortgen();
        System.out.println(dikdortgenObj.alanHesapla());

        dikdortgenObj=new Dikdortgen(2);
        System.out.println(dikdortgenObj.alanHesapla());

        dikdortgenObj=new Dikdortgen(4,2);
        System.out.println(dikdortgenObj.alanHesapla());
         */

        /*
        //polimorfizm
        Ogrenci ogrenciObj=new Ogrenci();
        ogrenciObj.getOgrenciNot();
        ogrenciObj.setOgrenciNot(290);
         */

        //miras alma
        /*
        Memur memurObj=new Memur();
        System.out.println(memurObj.maasHesapla(4,40,120));
         */

        /*
        OgretimUyesi ogretimUyesiObj=new OgretimUyesi();
        System.out.println(ogretimUyesiObj.maasHesapla(5,30,120));
         */

        /*
        Memur memurObj=new Memur();
        System.out.println("Sicil No: "+ (memurObj.sicilNo=200));
         */
        Iphone14 iphone14Obj=new Iphone14();
        iphone14Obj.AramaYapma("05371234567");
        iphone14Obj.MesajAtma("05371234567","Hey");
        iphone14Obj.InterneteBaglan("xzcorp");
        iphone14Obj.ZilSesi();
        iphone14Obj.Oyunlar("Arcade");

        System.out.println();
        System.out.println();

        Nokia3310 nokia3310Obj=new Nokia3310();
        nokia3310Obj.AramaYapma("05361234567");
        nokia3310Obj.MesajAtma("05361234567","Hello");
        nokia3310Obj.TakozOzelligi();
        nokia3310Obj.ZilSesi();
        nokia3310Obj.Oyunlar("Yılan");

    }
    /*
    //Demeter Kuralı
    private DegiskenTipi degisken;
    public void birMetotKimleriCagirabilir(parametre tipi parametre){
        ayniSinifIcindeBulunanBaskaBirMetot();
        degisken.meototlari();
        parametre.metotlari();

        BirDigerNesneTipi birDigerNesne=new birDigerNesneTipi;
        birDigerNesne.metotlari();
    }
     */
}