import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        String a, b;
        double c, d;

        System.out.println("Ogrenci Sayisini Giriniz: ");
        Scanner s = new Scanner(System.in);
        int mevcut = s.nextInt();

        Sinif[] ogrenciler = new Sinif[mevcut];
        
        int i = 0;
        while (i < mevcut) {

            System.out.println("\nOgrenci Isminizi giriniz");
            a = s.next();

            System.out.println("\nOgrenci Cinsiyetini giriniz");
            b = s.next();

            System.out.println("\n" + a + " ogrencinin Vize1 notunu giriniz");
            c = s.nextFloat();

            System.out.println("\n" + a + " ogrencinin Vize2 notunu giriniz");
            d = s.nextFloat();
            
            ogrenciler[i] = ogrenciler[i++].ogrenciBilgileriEkle(a, b, c, d);
        }

        Sinif ogrencilerr = new Sinif();
        System.out.println("Vize1 giren tum ogrencilerin not ortalamasi: " + ogrencilerr.vize1Ortalama(ogrenciler, mevcut));
        System.out.println("\nVize2 giren tum ogrencilerin not ortalamasi: " + ogrencilerr.vize2Ortalama(ogrenciler, mevcut));
        System.out.println("\nVize1 giren tum ogrencilerin notunun standart sapmasi: " + ogrencilerr.vize1StandartSapma(ogrenciler, mevcut));
        System.out.println("\nVize2 giren tum ogrencilerin notunun standart sapmasi: " + ogrencilerr.vize2StandartSapma(ogrenciler, mevcut));
        System.out.println("\nVizelere giren ortalama ustu tum ogrencilerin adlari listesi" + ogrencilerr.ortalamaUstuOgrenciAdlariListele(ogrenciler, mevcut));
        System.out.println("\nSinava giren ogrencilerin genel harf notu listesi");
        ogrencilerr.genelHarfNotuBelirle(ogrenciler, mevcut);
        
	}
}
