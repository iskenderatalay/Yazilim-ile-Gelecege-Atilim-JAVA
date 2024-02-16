public class Main {
    public int sayi10=100;
    static final double PI=3.14;
    // static Adresi belli her yerden erisilir
    public static void main(String[] args) {
        /*
		System.out.println("Merhaba Dunya");

		int sayi1=100;
		System.out.println(sayi1);

		char karakter = 'A';
		System.out.println(karakter);

		byte ogrenciNot = 100;
		System.out.println(ogrenciNot);

		short shortDegisken = 30000;
		System.out.println(shortDegisken);

		long longDegisken = 1;
		System.out.println(longDegisken);

		float floatDegisken = 76.3f;
		System.out.println(floatDegisken);

		double doubleDegisken = 2.35;
		System.out.println(doubleDegisken);

		boolean booleanDegisken = false;
		System.out.println(booleanDegisken);

		int[] sayilar = {1,2,3,4,5};
		System.out.println(sayilar);

		int[] sayilar2 = new int[10];
		sayilar2[3] = 100;

		float[] floatSayilar = {12.4f,34.5f,67.9f};
		System.out.println(floatSayilar);

		System.out.println(sayilar[1]);
		System.out.println(floatSayilar[1]);

		String mesaj = "Merhaba Dunya";
		System.out.println(mesaj);

		//main mainNesnesi = new main();

		//ilkeli referans tipine cevirme
		byte ogrNot = 100;
		Byte ogrNot1 = new Byte(1);
		Integer sayi5 = new Integer(10);
		Character karakterDegisken = new Character('A');

		int [] dizi = new int[5];
		dizi[0]=5;
		dizi[1]=10;
		dizi[2]=15;
		dizi[3]=20;
		dizi[4]=25;

		for(int i=0;i<5;i++)
			dizi[i]=i+1;


		for(int i=0;i<5;i++) {
			dizi[i]=5*(i+1);
			System.out.println(dizi[i]);
		}

		for(int i=0;i<5;i++) {
			dizi[i]=5*(i+1);
			System.out.print(dizi[i]+" ");
		}

		int[] tekBoyutlu;
		int [][] ikiBoyutlu;
		int [][][] ucBoyutlu;
		int [][][][] dortBoyutlu;

		String[][] adSoyad = new String[2][3];

		adSoyad[0][0] = "Hüseyin";
		adSoyad[0][1] = "Hasan";
		adSoyad[0][2] = "Mert";

		adSoyad[1][0] = "Mehmet";
		adSoyad[1][1] = "Ali";
		adSoyad[1][2] = "Yılmaz";

		for(int i=0; i<adSoyad.length; i++) {
			System.out.println();
			for(int j=0; j<adSoyad[i].length; j++) {
				System.out.print(adSoyad[i][j] + " ");
			}
		}
		int x=9;
		int X=7;
		System.out.println(x);
		System.out.println(X);
		 */

        //final int sayi = 100; Sayinin degeri bir daha degistirilemez

        final int sayi5 = 100;

        short veri1 = 100;
        int veri2;

        veri2 = veri1;

        short veri3;
        int veri4 = 10;
        veri3=(short)veri4;

        byte veri5;
        int veri6 = 127;
        veri5=(byte)veri6;
        System.out.println(veri5);

        String byteSayi = "10";
        byte byteSayi1 = Byte.valueOf(byteSayi);
        byte byteSayi2 = Byte.parseByte(byteSayi);

        String shortSayi = "1000";
        short shortSayi1 = Short.parseShort(shortSayi);
        short shortSayi2 = Short.valueOf(shortSayi1);

        String doubleSayi = "3.14";
        double doubleSayi1 = Double.parseDouble(doubleSayi);
        double doubleSayi2 = Double.valueOf(doubleSayi1);
    }
}