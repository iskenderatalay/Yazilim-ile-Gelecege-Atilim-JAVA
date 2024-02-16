public class Main {
    public static void main(String[] args) {
        /*
		boolean gelenCevap=kullaniciAdiSifreKontrol("admin","123456");
		if(gelenCevap)
			Session.initialize();
		 */

        /*
		abs(-8);
		abs(8);
		 */

        /*
		for(int i=0; i<10; i++) {
			double sonuc=hesaplama(i);
		}
		 */

        /*
		main mainNesnesi=new main();
		System.out.println(mainNesnesi.dortIslem2(2.1, 4.9, '/'));
		 */

        //System.out.println(ucunKuvvetiKontrol(81));

        //System.out.println(asalKontrol(6));

        //System.out.println(asalKontrolOzyinemeli(17,17/2));

        Main mainNesnesi=new Main();
        System.out.println(mainNesnesi.faktoriyel(3));

        System.out.println(faktoriyelOzyinemeli(6));

    }

    /*
	static boolean kullaniciAdiSifreKontrol (String kullaniciAdi, String sifre) {
		if(kullaniciAdi.equals("admin")&& sifre.equals("123456"))
		{
			Session.initialize();
			return true;
		}
		else
			return false;
	}
	 */

    /*
	static int abs (int deger)
	{
		if(deger<0)
			return -deger;
		else
			return deger;
	}
	 */

    /*
	static int hesaplama(int sayi) {
		if(sayi<0)
			return sayi/2;
		else if(sayi>0 && sayi<=5)
			return sayi*2;
		else if(sayi>5 && sayi<=10)
			return sayi*3;
		else if(sayi>10 && sayi<=20)
			return sayi*4;
		else
			return sayi*5;
	}
	 */

    /*
	static double hesaplama(int sayi) {
		double hesaplamaSonucu;
		if(sayi<0)
			hesaplamaSonucu=sayi/2;
		else if(sayi>0 && sayi<=5)
			hesaplamaSonucu=sayi*2;
		else if(sayi>5 && sayi<=10)
			hesaplamaSonucu=sayi*3;
		else if(sayi>10 && sayi<=20)
			hesaplamaSonucu=sayi*4;
		else
			hesaplamaSonucu=sayi*5;

		//return tek olmalı
		return hesaplamaSonucu;
	}
	 */

    /*
	double dortIslem(int sayi1,int sayi2, char operator) {
		double sonuc=0;
		if(operator=='+')
			sonuc=sayi1+sayi2;
		else if(operator=='-')
			sonuc=sayi1-sayi2;
		else if(operator=='*')
			sonuc=sayi1*sayi2;
		else if(operator=='/')
			sonuc=sayi1/sayi2;
		return sonuc;
	}
	 */

    /*
    double dortIslem2(double sayi1,double sayi2, char operator) {
        double sonuc=0;
        switch(operator) {
            case '+':sonuc=sayi1+sayi2; break;
            case '-':sonuc=sayi1-sayi2; break;
            case '*':sonuc=sayi1*sayi2; break;
            case '/':sonuc=sayi1/sayi2; break;
        }
        return sonuc;
    }
     */

    /*
    static boolean ucunKuvvetiKontrol(double sayi) {
        if(sayi==1&&sayi%2==1)
            return true;
        else if(sayi<3)
            return false;
        else {
            return ucunKuvvetiKontrol(sayi/3);
        }
    }
     */

    /*
    static boolean asalKontrol(int sayi){
        boolean sonuc=true;
        if(sayi<2)
            sonuc=false;
        else
            for(int i=2;i<sayi;i++)
                if(sayi%i==0)
                    sonuc=false;
        return sonuc;
    }
     */

    /*
    static boolean asalKontrolOzyinemeli(int sayi, int i){
        if(i==1){
            return true;
        }
        else{
            if(sayi%i==0)
                return false;
            else
                return asalKontrolOzyinemeli(sayi,i-1);
        }
    }
     */

    int faktoriyel(int sayi){
        int sonuc=1;
        for(int i=1;i<=sayi;i++)
            sonuc*=i;
        return sonuc;
    }

    static int faktoriyelOzyinemeli(int sayi){
        if(sayi>=1)
            return sayi*faktoriyelOzyinemeli(sayi-1);
        else
            return 1;
    }
}