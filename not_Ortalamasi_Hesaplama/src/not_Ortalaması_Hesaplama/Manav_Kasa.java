package not_Ortalamasý_Hesaplama;
import java.util.Scanner;
public class Manav_Kasa {

	public static void main(String[] args) {
	double armut=2.14,elma=3.67,domat=1.11,muz=0.95,
			ptlcn=5, toplam=0;
	Scanner in= new Scanner(System.in);
	
	System.out.println("Armut kilosunu giriniz: ");
	double kilo=in.nextDouble();
	toplam+=armut*kilo;
	System.out.println("Elma kilosunu giriniz: ");
	kilo=in.nextDouble();
	toplam+=elma*kilo;
	System.out.println("Domates kilosunu giriniz: ");
	kilo=in.nextDouble();
	toplam+=domat*kilo;
	System.out.println("Muz kilosunu giriniz: ");
	kilo=in.nextDouble();
	toplam+= muz*kilo;
	System.out.println("Patlýcan kilosunu giriniz: ");
	kilo=in.nextDouble();
	toplam+=ptlcn*kilo;
	System.out.println("toplam tutar= "+toplam);
	

	}

}
