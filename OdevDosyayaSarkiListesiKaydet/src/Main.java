import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sarki;
        Scanner getData=new Scanner(System.in);
        System.out.println("Eklemek İsteğiniz Şarkıyı Yazın");
        sarki=getData.nextLine();

        if(fileRead("sarkilar.txt").contains(sarki)){
            System.out.println("Bu Şarkı Var, Başka Ekleyin");
        }
        else{
            fileWrite("sarkilar.txt",sarki);
            System.out.println("== Güncel Liste == ");
            for(int i=0;i<fileRead("sarkilar.txt").size();i++){
                System.out.println((i+1)+".Şarkı = "+fileRead("sarkilar.txt").get(i));
            }
        }
    }
    static boolean fileExist(String path){
        File file=new File(path);
        return file.exists();
    }
    static void fileCreate(String path){
        if(!fileExist(path)){
            try{
                File file=new File(path);
                file.createNewFile();
            }
            catch (IOException e){
                System.out.println("Hata:Dosya Olusturulamıyor!!!");
            }
        }
    }
    static void fileDelete(String path){
        if(fileExist(path)){
            File file=new File(path);
            file.delete();
        }
    }
    static void fileWrite(String path,String sarki){
        try{
            FileWriter fileWriterObj=new FileWriter(path,true);
            fileWriterObj.write(sarki+"\n");
            fileWriterObj.close();
        }
        catch (IOException e){
            System.out.println("Hata:Dosyaya yazdırılamıyor!!!");
        }
    }
    static ArrayList<String> fileRead(String path){
        ArrayList<String> list=new ArrayList<>();
        if(fileExist(path)){
            try{
                FileReader fileReaderObj=new FileReader(path);
                BufferedReader bufferObj=new BufferedReader(fileReaderObj);
                String line;
                while((line=bufferObj.readLine())!=null){
                    list.add(line);
                }
                bufferObj.close();
                fileReaderObj.close();
            }
            catch(IOException e){
                System.out.println("Hata:Dosyaya okunamıyor!!!");
            }
        }
        return list;
    }
}
