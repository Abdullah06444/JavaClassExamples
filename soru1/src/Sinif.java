import java.lang.Math;

//enum harfNotu{ FF, DD(50), DC(60), CC(65), CB(70), BB(75), BA(80), AA(85) };

public class Sinif {

    String ogrenciName, cinsiyet;
    double vize1, vize2;
    
    public static Sinif ogrenciBilgileriEkle(String a, String b, double c, double d) {

    	Sinif sinif = new Sinif();
        sinif.ogrenciName = a;
        sinif.cinsiyet = b;
        sinif.vize1 = c;
        sinif.vize2 = d;
        
        return sinif;
    }

    public static String ortalamaUstuOgrenciAdlariListele(Sinif[] sinif, int mevcut) {

    	String vizeOrtalamaUstuOgrenciAdlari = "\nVize 1 Ortalamasi Yuksek Olan Ogrenciler\n";
    	
        for(Sinif s:sinif)
        	vizeOrtalamaUstuOgrenciAdlari += s.vize1 > vize1Ortalama(sinif, mevcut) ? s.ogrenciName + "\t" : "";
        
        vizeOrtalamaUstuOgrenciAdlari += "\nVize 2 Ortalamasi Yuksek Olan Ogrenciler\n";
        	
    	for(Sinif s:sinif)
        	vizeOrtalamaUstuOgrenciAdlari += s.vize2 > vize2Ortalama(sinif, mevcut) ? s.ogrenciName + "\t" : "";
                	
        return vizeOrtalamaUstuOgrenciAdlari;
    }

	public static double vize1Ortalama(Sinif[] sinif, int mevcut) {

        double toplamVize1 = 0;
        
        for(Sinif s:sinif)
            toplamVize1 += s.vize1;
        return (double) toplamVize1 / mevcut;
    }
    
    public static double vize2Ortalama(Sinif[] sinif, int mevcut) {

        double toplamVize2 = 0;
        
        for(Sinif s:sinif)
            toplamVize2 += s.vize2;
        return (double) toplamVize2 / mevcut;
    }
    
    public static double vize1StandartSapma(Sinif[] sinif, int mevcut) {

        double toplamVize1OrtalamaArasindakiFarkininKaresi = 0;
        
        for(Sinif s:sinif)
        	toplamVize1OrtalamaArasindakiFarkininKaresi += Math.pow(s.vize1 - vize1Ortalama(sinif, mevcut), 2);
        return (double) Math.sqrt(toplamVize1OrtalamaArasindakiFarkininKaresi / (mevcut-1));
    }
    
    public static double vize2StandartSapma(Sinif[] sinif, int mevcut) {

        double toplamVize2OrtalamaArasindakiFarkininKaresi = 0;
        
        for(Sinif s:sinif)
        	toplamVize2OrtalamaArasindakiFarkininKaresi += Math.pow(s.vize2 - vize2Ortalama(sinif, mevcut), 2);
        return (double) Math.sqrt(toplamVize2OrtalamaArasindakiFarkininKaresi / (mevcut-1));
    }
    
    public static void genelHarfNotuBelirle(Sinif[] sinif, int mevcut) {
    	
    	for(Sinif s:sinif) {
    		double dersOrtalamasi = 0.3*s.vize1+0.7*s.vize2;
    		String t = dersOrtalamasi >= 50 ? dersOrtalamasi >= 65 ? "gectiniz" : "sartli gectiniz" : "kaldiniz";	
    		System.out.println(s.ogrenciName + " dersi " + dersOrtalamasi + " ortalama ile "+ t +". Harf Notunuz " + harfNotu(dersOrtalamasi));
    	}
    }
    
    public static String harfNotu(double ort) {
    	
    	String harfNotu = "";
    	
    	if(ort <= 100 && ort >=85)
    		harfNotu = "AA";
    	if(ort < 85 && ort >= 80)
    		harfNotu = "BA";
    	if(ort < 80 && ort >= 75)
    		harfNotu = "BB";
    	if(ort < 75 && ort >= 70)
    		harfNotu = "CB";
    	if(ort < 70 && ort >= 65)
    		harfNotu = "CC";
    	if(ort < 65 && ort >= 60)
    		harfNotu = "DC";
    	if(ort < 60 && ort >= 50)
    		harfNotu = "DD";
    	if(ort < 50 && ort >= 0)
    		harfNotu = "FF";
    		
    	return harfNotu;
    }
}
