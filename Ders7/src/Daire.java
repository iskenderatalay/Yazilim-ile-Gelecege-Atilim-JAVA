public class Daire {
    double pi,yariCap;
    Daire(){  //yapılandırıcı metot
        pi=3;
        yariCap=1;
    }
    Daire(double yariCap){ //overloading
        this.yariCap=yariCap;
        pi=3;
    }
    Daire(double yariCap,double pi){ //overloading
        this.yariCap=yariCap;
        this.pi=pi;
    }
    double alanHesapla(){
        return pi*Math.pow(yariCap,2);
    }
}

