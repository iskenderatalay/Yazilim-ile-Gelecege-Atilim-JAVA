package arayuzDigerOrnek2;

public class Genc {
    interface  futbolOynamak {
        int oyuncuSayisi=22;
        String aracGerec="2 kale 1 top";
        void futbolOyna();
    }
    public class gencErkek implements futbolOynamak {
        @Override
        public void futbolOyna() {
            System.out.println("Erkekler futbol oynamayı sever");
        }
    }
}
