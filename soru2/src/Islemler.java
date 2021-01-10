import java.util.Scanner;

public class Islemler {

	int i=0;
	Araba[] arabalar2 = new Araba[30];
	
	public static void arabaVerileriEkle(Araba[] araba) {
		
		Scanner s = new Scanner(System.in);
		int i=0;
		while(i < 30) {
			
			System.out.println("Arac sahibinin ismini giriniz: ");
			String isim = s.next();
			System.out.println("Arac sahibinin yasini giriniz: ");
			int yas = s.nextInt();
			System.out.println("Arac sahibinin cinsiyetini giriniz: ");
			char cinsiyet = s.next().charAt(0);
			
			Kisi kisiler2 = new Kisi(isim, cinsiyet, yas);
			i++;
		}

		arabalar2[i] = new Araba("","","","","");
		arabalar2[i].setKisi(kisi);	
		
	}
	
	public static void plakaKontrol() {
		
		
	}
	
	public static void bayYuzde() {
		
		
	}
	
	public static void bayanYuzde() {
		
		
	}
	
	public static void arabaBilgileriListele() {
		
		
	}
	
}
