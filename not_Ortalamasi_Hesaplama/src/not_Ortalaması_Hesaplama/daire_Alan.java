package not_Ortalamasý_Hesaplama;
import java.util.Scanner;

public class daire_Alan {

	public static void main(String[] args) {
		double r, alan, pi= 3.14, a;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("yarýçap deðerini giriniz: ");
		r=scan.nextDouble();
		System.out.println("yay açýsýný giriniz: ");
		a= scan.nextDouble();
		
		alan = (pi*(r*r)*a)/360;
		System.out.println("daire yayýnýn alaný= "+alan);

	}

}
