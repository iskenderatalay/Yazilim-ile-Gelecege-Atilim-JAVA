import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Main mainNesne=new Main();

        /*
        double toplamTutar= mainNesne.kdvliUrunFiyatBul("Bisiklet",100);
        System.out.println("Toplam Tutar = "+toplamTutar);
        //System.out.println("Kdvli Toplam Fiyat = "+mainNesne.kdvliUrunFiyatBul("Gida",100));
        //System.out.println("Kdvli Toplam Fiyat = "+kdvliUrunFiyatBul("Bisiklet",100));

        System.out.println("Toplam Tutar= "+mainNesne.kdvliUrunFiyatBul2("Mobilya",100));
         */

        /*
        List genericDegil=new ArrayList();
        genericDegil.add("Merhaba");
        genericDegil.add(2);
        genericDegil.add(false);
        String sonuc;
        for(int i=0;i<genericDegil.size();i++){
            sonuc=(String) genericDegil.get(i);
        }
         */

        /*
        List<String> generic=new ArrayList();
        generic.add("Merhaba");
        //generic.add(23); String olmalı basta List String dedik
        //generic.add(false); String olmalı basta List String dedik

        List<Integer> generic2=new ArrayList();
        generic2.add(23);
        //generic2.add("Merhaba"); Integer olmalı basta List Integer dedik
        //generic2.add(false); Integer olmalı basta List Integer dedik
         */

        /*
        Ogrenciler<Integer> notlar=new Ogrenciler<>();
        notlar.listeyeEkle(34);
        notlar.listeyeEkle(100);
        notlar.listeyeEkle(90);

        Ogrenciler<String> ogrAdlari=new Ogrenciler<>();
        ogrAdlari.listeyeEkle("Hüseyin");
        ogrAdlari.listeyeEkle("Hasan");
        ogrAdlari.listeyeEkle("Ayşe");

        System.out.println(notlar.listeyiGetir());
        System.out.println(ogrAdlari.listeyiGetir());

        Calisanlar<Integer> isci=new Calisanlar<>();
        isci.ad="Hüseyin";
        isci.soyad="Bodur";
        isci.maas=4000;

        Calisanlar<Double> muhendis=new Calisanlar<>();
        muhendis.ad="Ayşe";
        muhendis.soyad="Fatma";
        muhendis.maas=8000.8;
         */

        /*
        double sonuc;
        sonuc=Math.pow(2,3);
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.sqrt(16);
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.abs(-5);
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.ceil(2.56); //üste yuvarlama
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.floor(2.56); //alta uyarlama
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.max(5,3); //max döndürür
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.min(5,3); //min döndürür
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.random();
        System.out.println("Sonuc = "+sonuc);

        sonuc=Math.random()*100;
        int sonuc2=(int) Math.round(sonuc);
        System.out.println("Sonuc = "+sonuc2);
        int sonuc3=(int) Math.ceil(sonuc);
        System.out.println("Sonuc = "+sonuc3);
        int sonuc4=(int) Math.floor(sonuc);
        System.out.println("Sonuc = "+sonuc4);
        int sonuc5=(int)sonuc;
        System.out.println("Sonuc = "+sonuc5);

        System.out.println("PI = "+Math.PI);
        System.out.println("E = "+Math.E);
        System.out.println("TAU = "+Math.TAU);

        System.out.println("XZ Sabiti = "+Matematik.XZ); //Kendim sabit olusturdum
         */

        System.out.println("Altın Oran = "+Hesap.altinOran(55,34));
        System.out.println("Altın Oran = "+Hesap.altinOran(55,89));
    }
    double kdvliUrunFiyatBul(String urunTuru,double urunFiyati){
        double kdvOran,kdvTutar,toplamTutar;
        if(urunTuru.equals("Mobilya")){
            kdvOran=0.08;
            kdvTutar=urunFiyati*kdvOran;
            toplamTutar=urunFiyati+kdvTutar;
        }
        else if(urunTuru.equals("Beyaz Eşya")){
            kdvOran=0.18;
            kdvTutar=urunFiyati*kdvOran;
            toplamTutar=urunFiyati+kdvTutar;
        }
        else if(urunTuru.equals("Gıda")){
            kdvOran=0.2;
            kdvTutar=urunFiyati*kdvOran;
            toplamTutar=urunFiyati+kdvTutar;
        }
        else{
            kdvOran=0.12;
            kdvTutar=urunFiyati*kdvOran;
            toplamTutar=urunFiyati+kdvTutar;
        }
        return toplamTutar;
    }
    double kdvliUrunFiyatBul2(String urunTuru,double urunFiyati){
        double kdvOran;
        if(urunTuru.equals("Mobilya"))
            kdvOran=0.08;
        else if(urunTuru.equals("Beyaz Eşya"))
            kdvOran=0.18;
        else if(urunTuru.equals("Gıda"))
            kdvOran=0.2;
        else
            kdvOran=0.12;
        return urunFiyati+(urunFiyati*kdvOran);
    }
}