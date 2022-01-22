import java.util.Scanner;
public class KDV_Hesabi {

	public static void main(String[] args) {
		int tutar;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("KDV hesaplanacak tutarý giriniz: ");
		tutar= scn.nextInt();
		double kdv= tutar>1000 ? 0.08 : 0.18;
		double son= tutar+tutar*kdv;
		System.out.println("KDV'siz fiyat= "+tutar);
		System.out.println("KDV'li fiyat= "+son);
		System.out.println("KDV tutarý= "+(son-tutar));
		

	}

}
