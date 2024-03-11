import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {
    Connection baglantiObj;
    baglanti()
    {
        try {
            baglantiObj= DriverManager.getConnection("jdbc:mysql://localhost:3306/ders11?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Bağlantı başarılı");
        }
        catch (SQLException e) {
            System.out.println("Bağlantı başarısız");
            System.out.println(e.toString());
        }
    }

    public int personelEkle(String tc,short sicilNo,String adSoyad,String dogumTarihi,boolean medeniDurum,String gorev,boolean seyahatEngel) {
        int kayitSonuc=0;
        byte medeniDurumByte=0;
        byte seyahatEngeliByte=0;

        if(medeniDurum==true)
            medeniDurumByte=1;
        if(seyahatEngel==true)
            seyahatEngeliByte=1;

        try {
            String sorgu="insert into personel (tc,sicilno,adsoyad,dogumtarihi,medenidurum,gorev,seyahatengeli) values('"+tc+"','"+sicilNo+"','"+adSoyad+"','"+dogumTarihi+"','"+medeniDurumByte+"','"+gorev+"','"+seyahatEngeliByte+"')";
            Statement durumObj= baglantiObj.createStatement();
            kayitSonuc=durumObj.executeUpdate(sorgu);
            durumObj.close();
        } catch (SQLException e) {
            System.out.println("Hata ="+e.toString());
        }

        return kayitSonuc;
    }

    void baglantiyiKapat() {
        try {
            baglantiObj.close();
        } catch (SQLException e) {
            System.out.println("Hata ="+e.toString());
        }
    }
}