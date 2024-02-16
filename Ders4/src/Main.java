import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int sayi=6,usDeger=3,sonuc=1;
        while(usDeger!=0){
            sonuc*=sayi;
            usDeger-=1;
        }
        System.out.println(sonuc);

        Main mainNesnesi=new Main();
        System.out.println(mainNesnesi.usHesaplama(2,3));
         */

        //int sayi1=10,sayi2=45;
        /*
        int obeb=1,okek;
        for(int i=1;i<=sayi1 && i<=sayi2;i++){
            if(sayi1%i==0 && sayi2%i==0)
                obeb=i;
        }
        okek=(sayi1*sayi2)/obeb;
        System.out.println(sayi1+" ve "+sayi2+" =>>"+" obebi = "+obeb+" okeki = "+okek);
         */
        //System.out.println(sayi1+" ve "+sayi2+" =>> "+" obebi = "+obebHesapla(sayi1,sayi2)+" okeki = "+(sayi1*sayi2)/obebHesapla(sayi1,sayi2));

        int[] sayilar={1,2,3,4,5};
        int[] sayilar2=new int[5];
        sayilar2[0]=1;
        sayilar2[1]=2;
        sayilar2[2]=3;
        sayilar2[3]=4;
        sayilar2[4]=5;

        String[] sehirler={"Düzce","Bolu","Sakarya"};
        char[] alfabe=new char[4];
        alfabe[0]='a';
        alfabe[1]='b';
        alfabe[2]='c';
        //alfabe[100]='s';

        /*
        int[] sayilarBunlar={45,67,12,1,13,89,3,56,8,11};
        int[] siralanmisSayilar=sayilariSirala(sayilarBunlar);
        for(int i=0;i<siralanmisSayilar.length;i++)
            System.out.print(siralanmisSayilar[i]+" ");
         */

        /*
        String mesaj="Merhaba Dünya";
        for(int i=0;i<100;i++){
            System.out.println(mesaj);
        }
         */

        /*
        int[] Adizisi=new int[10];
        int[] Bdizisi=new int[10];
        Scanner okunanVeri;
        char secim;

        okunanVeri=new Scanner(System.in);
        System.out.println("Bir Dizi Seçin {A-B}: ");
        secim=okunanVeri.next().toUpperCase().charAt(0);
        okunanVeri.close();
         */

        /*
        for(int i=0;i<10;i++){
            if(secim=='A')
                Adizisi[i]=i+1;
            else if(secim=='B')
                Bdizisi[i]=i+3;
            else{
                System.out.println("Hatalı Seçim");
                break;
            }
        }
         */

        /*
        if(secim=='A'){
            for(int i=0;i<10;i++)
                Adizisi[i]=i+1;
        } else if (secim=='B') {
            for(int i=0;i<10;i++)
                Bdizisi[i]=i+3;
        }
        else
            System.out.println("Hatalı Seçim");
        */

        int tekToplam=0, ciftToplam=0;

        /*
        for(int i=1;i<=100;i++){
            if(i%2==0)
                ciftToplam+=i;
            else
                tekToplam+=i;
        }
         */

        for(int i=1;i<=100;i+=2){
            ciftToplam+=i+1;
            tekToplam+=i;
        }
        System.out.println("Teklerin Toplamı = "+tekToplam+ " Çiftlerin Toplamı ="+ciftToplam);

    }

    int usHesaplama(int sayi,int usDeger){
        if(usDeger==0 || sayi==1)
            return 1;
        else
            return sayi*usHesaplama(sayi,usDeger-1);
    }
    static int obebHesapla(int sayi1,int sayi2){
        if(sayi2==0)
            return sayi1;
        else
            return obebHesapla(sayi2,sayi1%sayi2);
    }
    //Bubble Siralama
    static int[] sayilariSirala(int[] sayilar) {
        int gecici,sayac=0;
        for (int i=0;i<sayilar.length-1;i++) {
            for (int j=i+1;j<sayilar.length;j++) {
                if (sayilar[j]<sayilar[i]) {
                    gecici=sayilar[i];
                    sayilar[i]=sayilar[j];
                    sayilar[j]=gecici;
                }
                sayac++;
            }
        }
        System.out.println("Sayaç = "+sayac);
        return sayilar;
    }
}