public class DersYonetimi {
    void minimumOgrenciSayisiKontrol(int sinifMevcudu,int silinecekOgrenciSayisi) throws MinimumOgrenciSayisi {
        if((sinifMevcudu-silinecekOgrenciSayisi)<10)
            throw new MinimumOgrenciSayisi("Dersi alan öğrenci sayısı 10'dan az olamaz");
    }
    void maksimumOgrenciSayisiKontrol(int sinifMevcudu,int eklenecekOgrenciSasyisi) throws MaksimumOgrenciSayisi {
        if((sinifMevcudu+eklenecekOgrenciSasyisi)>40)
            throw new MaksimumOgrenciSayisi("Dersi alan öğrenci sayisi 40'tan fazla olamaz");
    }
}
