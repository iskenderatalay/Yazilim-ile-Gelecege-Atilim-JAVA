public class Personel {

    public int sicilNo;
    Personel(){
        System.out.println("Personel Sınıf Yapılandırıcısı");
    }
    double maasHesapla(int katSayi, int mesaiSaati, int mesaiUcreti){
        int brutMaas=katSayi*10000+mesaiSaati*mesaiUcreti;
        return brutMaas-(brutMaas*0.18);
    }
}
