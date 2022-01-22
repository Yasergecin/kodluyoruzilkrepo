package not_Ortalamasý_Hesaplama;
import java.util.Scanner;

public class Not_Ortalamasi {

	public static void main(String[] args) {
		int mat, fizik, kimya, tarih, muzik, turkce;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz: ");
		mat= in.nextInt();
		
		System.out.println("Fizik notunuzu giriniz: ");
		fizik= in.nextInt();
		
		System.out.println("Kimya notunuzu giriniz: ");
		kimya= in.nextInt();
		
		System.out.println("Tarih notunuzu giriniz: ");
		tarih= in.nextInt();
		
		System.out.println("Müzik notunuzu giriniz: ");
		muzik= in.nextInt();
		
		System.out.println("Türkçe notunuzu giriniz: ");
		turkce= in.nextInt();
		
		double ortalama= (mat+fizik+kimya+muzik+tarih+turkce)/6;
		String sonuc= ortalama>=60 ? "Sýnýfý geçti" : "Sýnýfta Kaldý";
		System.out.println("Ortalamnýz: "+ortalama);
		System.out.println(sonuc);

	}

}
