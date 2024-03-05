package cokbicimlilik;

public class Main {
    public static void main(String[] args) {
        /*
        Normal Sınıf=>Gövdeli metotlar bulunur.
                    =>Nesnesi oluşturulabilir.
                    =>public,private,protected kullanılabilir.
        Soyut Sınıf=>Hem gövdeli hem de gövdesiz metotlar bulunabilir.
                   =>Nesnesi oluşturulamaz.
                   =>100 tane gövdeli metotun olsun 1 tane bile gövdesiz metot tanımlayacaksan o sınıf soyut tanımlanmak zorundadır.
                   =>public,private,protected kullanılabilir.
        Arayüz=>Sadece gövdesiz metotlar tanımlanabilir.
              =>Sadece public kullanılabilir.
              =>Nesnesi oluşturulamaz.
              =>Bir sınıf yanlızca bir üst sınıfa bağlanabilirken(extends),birden fazla arayüzden özellik alabilir(implement).
         */

        Hayvan hayvanObj=new Hayvan();
        Kus kusObj=new Kus();
        Balik balikObj=new Balik();
        Yilan yilanobj=new Yilan();

        /*
        eylemGerceklestir(hayvanObj);
        eylemGerceklestir(kusObj);
        eylemGerceklestir(balikObj);
        eylemGerceklestir(yilanobj);
         */

        eylemGerceklestir2(balikObj);
        eylemGerceklestir2(kusObj);
    }
    static void eylemGerceklestir(Hayvan hayvanTipindeParametre){
        hayvanTipindeParametre.eylem();
    }

    static void eylemGerceklestir2(Object nesne){
        if(nesne instanceof Balik){ //Çok biçimlilik olmasaydı hepsini böyle iflerle yapacaktın
            Balik balikObj=new Balik();
            balikObj.eylem();
        } else if (nesne instanceof Kus) {
            Kus kusObj=new Kus();
            kusObj.eylem();
        }
    }
}