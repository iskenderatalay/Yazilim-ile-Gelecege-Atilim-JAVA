import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        baglanti baglantiObj=new baglanti();

        /*
        int sonuc=baglantiObj.personelEkle("12345678",(short)56,"Selin Öztürk","11.05.1990",true,"memur",false);
        sonuc=baglantiObj.personelEkle("12345678",(short)56,"Ali","11.05.1990",true,"memur",false);

        if(sonuc==1)
            System.out.println("Kayıt eklendi");
        else
            System.out.println("Hata oluştu");
        baglantiObj.baglantiyiKapat();
         */

        /*
        int sonuc=baglantiObj.personelSil("12345678");
        if(sonuc>0)
            System.out.println("Silinen kayıt sayısı = "+sonuc);
        else
            System.out.println("Kayıt Silinmedi");
        baglantiObj.baglantiyiKapat();
         */

        /*
        ArrayList<String> okunanlar=baglantiObj.personelOku();
        baglantiObj.baglantiyiKapat();
        for(int i=0;i<okunanlar.size();i++){
            System.out.println(okunanlar.get(i));
        }
         */

        int sonuc=baglantiObj.personelGuncelle("21234",(short)3554,"Ayşe","22.05.1990",true,"işçi",false);
        if(sonuc>0)
            System.out.println("Güncellendi");
        else
            System.out.println("Kayıt Güncellenmedi");
        baglantiObj.baglantiyiKapat();
    }
}