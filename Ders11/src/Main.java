public class Main {
    public static void main(String[] args) {
        baglanti baglantiObj=new baglanti();
        int sonuc=baglantiObj.personelEkle("12345678",(short)56,"Selin Öztürk","11.05.1990",true,"memur",false);
        sonuc=baglantiObj.personelEkle("12345678",(short)56,"Ali","11.05.1990",true,"memur",false);

        if(sonuc==1)
            System.out.println("Kayıt eklendi");
        else
            System.out.println("Hata oluştu");

        baglantiObj.baglantiyiKapat();
    }
}