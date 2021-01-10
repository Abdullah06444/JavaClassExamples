import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String a, b, d ,e, f;
        char c;
        int y;

        System.out.println("Kisi Sayisini Giriniz: ");
        Scanner s = new Scanner(System.in);
        int mevcut = s.nextInt();
        
        Kisi[] kisiler = new Kisi[mevcut];
        Araba[] arabalar = new Araba[mevcut];
        
        int i = 0;
        while (i < mevcut) {

            System.out.println("\nKisi Isminizi giriniz");
            a = s.next();

            System.out.println("\nKisi Cinsiyetini giriniz (E/K)");
            c = s.next().charAt(0);

            System.out.println("\n" + a + " nin yasini giriniz");
            y = s.nextInt();
            
            kisiler[i] = kisiler[i].kisiVerileriniEkle(a, c, y);
            
            System.out.println("\nAraba Plakasini giriniz");
            a = s.next();
            
            System.out.println("\nAraba Uretim yilini giriniz");
            b = s.next();
            
            System.out.println("\nAraba durumu giriniz");
            d = s.next();
            
            System.out.println("\nAraba rengini giriniz");
            e = s.next();
            
            System.out.println("\nAraba Markasini giriniz");
            f = s.next();
            
            arabalar[i] = arabalar[i++].arabaVerileriniEkle(a, b, d, e, f);
        }
        
        //Araba arabalarr = new Araba("","","","","");
        Islemler islem = new Islemler();
        islem.arabaVerileriEkle(arabalar);
	}
}
