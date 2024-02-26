public class Ogrenci {

    /*
    Ogrenci(){} //yapılandırıcı metot
    Ogrenci(int a){} //overloading
     */
    private int ogrenciNot;

    public int getOgrenciNot() {
        return ogrenciNot;
    }

    public void setOgrenciNot(int ogrenciNot) {
        if(ogrenciNot>100)
            ogrenciNot=100;
        else if (ogrenciNot<0)
            ogrenciNot=0;
        this.ogrenciNot = ogrenciNot;
    }
}
