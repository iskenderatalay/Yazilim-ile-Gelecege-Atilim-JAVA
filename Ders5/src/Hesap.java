public class Hesap {
    final static String altinOranSabiti="1.618";
    static boolean altinOran(double sayi1,double sayi2){
        double max=Math.max(sayi1,sayi2);
        double islem=(sayi1+sayi2)/max;
        double sonuc=Math.round(islem*1000)/1000.0;

        //String islemVirgulSonrasi4=(islem+"").substring(0,5); //1.618 aldık
        if(altinOranSabiti.equals(sonuc))
            return true;
        else
            return false;
    }
}
