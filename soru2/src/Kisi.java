public class Kisi {

	String isim;
	char cinsiyet;
	int yas;
	
	// constructor
	public Kisi(String i, char c, int y) {
		
		this.isim = isim;
		this.cinsiyet = cinsiyet;
		this.yas = yas;
	}

	public static Kisi kisiVerileriniEkle(String a, char c, int y) {
		
		Kisi ki = new Kisi(a, c, y);		
		return ki;
	}
	
		
}
