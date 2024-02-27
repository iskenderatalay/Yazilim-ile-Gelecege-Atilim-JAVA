public class OgretimUyesi extends Personel{
    double vergiOrani=0.27;

    OgretimUyesi(){
        //super(); bunu kendisi arka planda ekliyor

        System.out.println("Ogretim Uyesi yapılandırıcısı");
        //System.out.println(super.vergiOrani);//baglı oldugu ust sınıfın degiskeni (super)
        //System.out.println(vergiOrani);//(this.vergiOrani)
    }

    void dersIsleri(){
        System.out.println("Ders isleri burada");
    }
}
