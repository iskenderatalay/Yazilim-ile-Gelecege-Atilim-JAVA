public class Dikdortgen {
    double a,b;
    Dikdortgen(){
        a=4.2;
        b=2;
    }
    Dikdortgen(double a){
        this.a=a;
        b=2;
    }
    Dikdortgen(double a,double b){
        this.a=a;
        this.b=b;
    }
    double alanHesapla(){
        return a*b;
    }
}
