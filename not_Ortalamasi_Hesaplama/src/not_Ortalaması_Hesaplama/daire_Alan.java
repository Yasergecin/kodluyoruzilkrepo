package not_Ortalamas�_Hesaplama;
import java.util.Scanner;

public class daire_Alan {

	public static void main(String[] args) {
		double r, alan, pi= 3.14, a;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("yar��ap de�erini giriniz: ");
		r=scan.nextDouble();
		System.out.println("yay a��s�n� giriniz: ");
		a= scan.nextDouble();
		
		alan = (pi*(r*r)*a)/360;
		System.out.println("daire yay�n�n alan�= "+alan);

	}

}
