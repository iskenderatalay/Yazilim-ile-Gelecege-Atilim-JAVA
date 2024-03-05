import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hata Yönetimi
        /*
        Hatalar => 1-Derleme Zamanı=Derleken çıkan uyarılar
                   2-Çalışma Zamanı=Kod çalışırken çıkan hatalar

        Throwable
        1-Exeption =>> IOExeption,IndexOutOfBoundExeption,NullPoint,ZeroDevision
        2-Error

        try{}
        catch{}
        final[}
         */

        /*
        //Çalışma Zamanı Hatası
        try {
            int sayilar[]={1,2,3,4};
            for(int i=0;i<10;i++){
                System.out.println(sayilar[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException diziTasmaHatasi) {
            System.out.println(diziTasmaHatasi.toString());
        }
         */

        /*
        //Sıfıra Bölme Hatası
        Scanner giris=new Scanner(System.in);
        int bolum,bolen;
        System.out.print("Bölümü Girin= ");
        bolum=giris.nextInt();
        System.out.println("Böleni Girin= ");
        bolen=giris.nextInt();
        try {
            System.out.println(bolum/bolen);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
         */

        /*
        //Dosyalama Hatası
        File dosya=new File("deneme.txt");
        FileWriter yazmaObj=null;
        try {
            yazmaObj=new FileWriter(dosya);
            yazmaObj.write("Merhaba Dunya");
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
        finally{
            try{
                yazmaObj.close();
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        try {
            dosyayaYazdir();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        DersYonetimi dersYonetimiObj=new DersYonetimi();
        int sinifMevcudu=25;
        int eklenecekOgrenci=20;
        int silinecekOgrenci=20;

        try {
            dersYonetimiObj.maksimumOgrenciSayisiKontrol(sinifMevcudu,eklenecekOgrenci);
            dersYonetimiObj.minimumOgrenciSayisiKontrol(sinifMevcudu,silinecekOgrenci);
        }
        catch (MaksimumOgrenciSayisi | MinimumOgrenciSayisi e) {
            System.out.println(e.toString());
        }
    }

    static void dosyayaYazdir() throws IOException {
        dosyayaYazdir2();
    }
    static  void dosyayaYazdir2() throws IOException { //throws Exeption Hatayı Görmezken Gelir Hatayı Üst Metoda Yollar
        File dosya=new File("deneme.txt");
        FileWriter dosyayaYazObj=new FileWriter(dosya);
        dosyayaYazObj.write("Selam");
        dosyayaYazObj.close();
    }
}