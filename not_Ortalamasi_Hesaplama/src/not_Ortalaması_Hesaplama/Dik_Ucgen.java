package not_Ortalamas�_Hesaplama;
import java.util.Scanner;
public class Dik_Ucgen {

	public static void main(String[] args) {
		int kenar1, kenar2, kenar3;
		Scanner scn= new Scanner(System.in);
		System.out.println("Birinci kenar�n �l��s�n� giriniz: ");
		kenar1= scn.nextInt();
		System.out.println("�kinci kenar�n �l��s�n� giriniz: ");
		kenar2= scn.nextInt();
		System.out.println("���nc� kenar�n �l��s�n� giriniz: ");
		kenar3= scn.nextInt();
		
		int u= (kenar1+kenar2+kenar3)/2;
		double alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
		System.out.println("��genin alan�= "+alan);
		

	}

}
