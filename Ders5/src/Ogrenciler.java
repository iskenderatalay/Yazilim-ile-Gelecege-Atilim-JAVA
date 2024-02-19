import java.util.ArrayList;

public class Ogrenciler<T> {
    ArrayList<T> liste=new ArrayList<>(); //T ler çalışırken tipini (int,string vb.) belirmek için kullanılır

    void listeyeEkle(T ekelenecekVeri){
        liste.add(ekelenecekVeri);
    }
    ArrayList<T> listeyiGetir(){
        return liste;
    }
}