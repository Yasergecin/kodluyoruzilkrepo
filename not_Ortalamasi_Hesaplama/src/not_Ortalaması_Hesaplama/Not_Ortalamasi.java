package not_Ortalamas�_Hesaplama;
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
		
		System.out.println("M�zik notunuzu giriniz: ");
		muzik= in.nextInt();
		
		System.out.println("T�rk�e notunuzu giriniz: ");
		turkce= in.nextInt();
		
		double ortalama= (mat+fizik+kimya+muzik+tarih+turkce)/6;
		String sonuc= ortalama>=60 ? "S�n�f� ge�ti" : "S�n�fta Kald�";
		System.out.println("Ortalamn�z: "+ortalama);
		System.out.println(sonuc);

	}

}
