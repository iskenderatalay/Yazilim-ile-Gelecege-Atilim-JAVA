public abstract class CepTelefonu {
    String telefonNumarasi,mesaj;
    CepTelefonu(){
        System.out.println("Cep Telefonu Yapılandırıcısı");
    }
    void AramaYapma(String telefonNumarasi){
        this.telefonNumarasi=telefonNumarasi;
        System.out.println(telefonNumarasi+" aranıyor");
    }
    void MesajAtma(String telefonNumarasi,String mesaj){
        this.telefonNumarasi=telefonNumarasi;
        this.mesaj=mesaj;
        System.out.println(telefonNumarasi+"'na gönderilen mesaj = "+mesaj);
    }

    //Eğer sınıf içersinde yanlızca bir tane bile abstract varsa o sınıf abstract olmak zorunda
    //Normal sınıf içersinde gövdeli metotlar bulunurken abstract sınıf içersinde hem gövdeli hem de gövdesiz metotlar bulunabilir

    abstract void ZilSesi();
    abstract  void Oyunlar(String oyunTuru);
}
