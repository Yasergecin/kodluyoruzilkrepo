package not_Ortalamas�_Hesaplama;

import java.util.Scanner;

public class Vucut_Kitle {

	public static void main(String[] args) {
		double kilo,boy, index;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz: ");
		kilo = in.nextDouble();
		System.out.println("Boyunuzu (metre cinsinden) giriniz: ");
		boy=in.nextDouble();
		index= kilo/(boy*boy);
		System.out.println("V�cut Kitle �ndeksiniz : "+index);
		in.close();
		

	}

}
