import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Main mainNesnesi=new Main();
        //system.out.println(mainNesnesi.dosyaVarMi(("deneme.txt")));
        /*
        mainNesnesi.dosyayaYazdir("deneme.txt","Merhaba Dünya");
        mainNesnesi.dosyaOku("deneme.txt");
        */
        /*
        mainNesnesi.dosyayaYazdir2("deneme.txt","Hello World");
        mainNesnesi.dosyaOku2("deneme.txt");
         */

        mainNesnesi.dosyayaYazdir("C:\\Users\\iskender\\Downloads\\Video\\deneme.txt","Merhaba Dünya");
        mainNesnesi.dosyaOku("C:\\Users\\iskender\\Downloads\\Video\\deneme.txt");

        mainNesnesi.dosyaOlustur("denemeolustu.txt");
        mainNesnesi.dosyaSil("denemeolustu.txt");

        //dosya tipi her şey olabilir sadece .txt ile sınırlı değil
    }
    boolean dosyaVarMi(String path){
        File dosya=new File(path);
        return dosya.exists();
        /*
        if(dosya.exists())
            return true;
        else
            return false;
         */
    }
    void dosyaOlustur(String path){
        if(!dosyaVarMi(path)){
            try{
                File dosya=new File(path);
                dosya.createNewFile();
            }
            catch (IOException e){ }
        }
    }
    void dosyaSil(String path){
        if(dosyaVarMi(path)){
            File dosya=new File(path);
            dosya.delete();
        }
    }
    void dosyayaYazdir(String path,String yazdirilacakVeri){
        try{
            FileWriter dosyayaYazdirObj=new FileWriter(path,true); //true var olanın üzerine yazar, false ise eskisini silip yazar
            dosyayaYazdirObj.write(yazdirilacakVeri+"\n");
            dosyayaYazdirObj.close();
        }
        catch(IOException e){ }
    }
    void dosyaOku(String path){
        if(dosyaVarMi(path)){
            try {
                FileReader okumaObj=new FileReader(path);
                BufferedReader bufferObj=new BufferedReader(okumaObj);
                String satir;
                while((satir=bufferObj.readLine())!=null){
                    System.out.println(satir);
                }
                bufferObj.close();
                okumaObj.close();
            }
            catch(IOException e){ }
        }
        else
            System.out.println("Dosya Bulunamadı");
    }
    void dosyayaYazdir2(String path,String yazdirilacakVeri){
        byte[] verininByteHali=yazdirilacakVeri.getBytes();
        try {
            FileOutputStream fileOutputObj=new FileOutputStream(path,true);
            BufferedOutputStream bufferObj=new BufferedOutputStream(fileOutputObj);
            bufferObj.write(verininByteHali);
            bufferObj.write("\n".getBytes());

            bufferObj.close();
            fileOutputObj.close();
        }
        catch(IOException e){ }
    }
    void dosyaOku2(String path){
        if (dosyaVarMi(path)) {
            try {
                File dosyam = new File(path);
                byte[] gelenByteVeriler = new byte[(int) dosyam.length()];
                FileInputStream fileInputObj = new FileInputStream(path);
                BufferedInputStream bufferInputObj = new BufferedInputStream(fileInputObj);
                bufferInputObj.read(gelenByteVeriler, 0,gelenByteVeriler.length);
                bufferInputObj.close();
                fileInputObj.close();

                String sonuc=new String(gelenByteVeriler, StandardCharsets.UTF_8);
                System.out.println(sonuc);
            }
            catch (IOException e){ }
        }
        else
            System.out.println("Dosya Bulunamadı");
    }
}