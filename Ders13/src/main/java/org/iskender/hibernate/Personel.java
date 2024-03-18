package org.iskender.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "personel")

public class Personel {
    private int id;
    private String tc;
    private short sicilno;
    private String adsoyad;
    private String dogumtarihi;
    private byte medenidurum;
    private byte seyahatengeli;
    private String gorev;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTc() {
        return tc;
    }
    public void setTc(String tc) {
        this.tc = tc;
    }
    public short getSicilno() {
        return sicilno;
    }
    public void setSicilno(short sicilno) {
        this.sicilno = sicilno;
    }
    public String getAdsoyad() {
        return adsoyad;
    }
    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }
    public String getDogumtarihi() {
        return dogumtarihi;
    }
    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
    public byte getMedenidurum() {
        return medenidurum;
    }
    public void setMedenidurum(byte medenidurum) {
        this.medenidurum = medenidurum;
    }
    public byte getSeyahatengeli() {
        return seyahatengeli;
    }
    public void setSeyahatengeli(byte seyahatengel) {
        this.seyahatengeli = seyahatengel;
    }
    public String getGorev() {
        return gorev;
    }
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}