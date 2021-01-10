public class Araba {

	private String plaka, uretimYili, durumu, renk, marka;
	private Kisi kisi;
	
	// constructor
	public Araba(String plaka, String uretimYili, String durumu, String renk, String marka) {
		
		this.plaka = plaka;
		this.uretimYili = uretimYili;
		this.durumu = durumu;
		this.renk = renk;
		this.marka = marka;
	}
	
	public static Araba arabaVerileriniEkle(String p, String uY, String d, String r, String m) {
		
		Araba ar = new Araba(p, uY, d, r, m);
		return ar;
	}
	
	public static String getPlaka() { return plaka;	}
	public void setPlaka(String plaka) { this.plaka = plaka; }
	
	public static String getUretimYili() { return uretimYili;	}
	public void setUretimYili(String uretimYili) { this.uretimYili = uretimYili; }
	
	public static String getDurumu() { return durumu;	}
	public void setDurumu(String durumu) { this.durumu = durumu; }
	
	public static String getRenk() { return renk;	}
	public void setRenk(String renk) { this.renk = renk; }
	
	public static String getMarka() { return marka;	}
	public void setMarka(String marka) { this.marka = marka; }
	
	public static Kisi getKisi() { return kisi;	}
	public void setKisi(Kisi kisi) { this.kisi = kisi; }
}
