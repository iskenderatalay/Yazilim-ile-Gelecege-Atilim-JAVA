package arayuzler;

public abstract class Vasita { //abstractta hem gövdeli hem gövdesiz metot tanımlanabilir.
    void hizGoster(int hiz){
        System.out.println("Saatteki hız = "+hiz);
    }
    void yolcuKapasitesi(int yolcuSayisi){
        System.out.println("Yolcu Kapasitesi = "+yolcuSayisi);
    }
    abstract void yolculukTuru(); //gövdesiz.Alt sınıfta(Kamyon) bunun gövdesi oluşturulmalı.
}
