import java.util.Scanner;
public class flight_Price {

	public static void main(String[] args) {
		double dist;
		int age, type;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("L�tfen gidilecek mesafeyi giriniz: ");
		dist=inp.nextDouble();
		
		System.out.println("L�tfen yolcunun ya��n� giriniz: ");
		age=inp.nextInt();
		
		System.out.println("L�tfen yolculuk tipini se�iniz");
		System.out.println("Tek Y�n i�in: 1, Gidi�-D�n�� i�in 2 giriniz");
		type=inp.nextInt();
		
		if(dist>0 && age>0 && type>=1 && type<=2) {
		 double total=dist*type*0.10;
			if(age<12) {
				total=total*0.5;
			}
			if(age>12 && age<24) {
				total=total*0.90;
			}
			if(age>65) {
				total=total*0.70;
			}
			if(type==2) {
				total=total*0.80;
			}
			System.out.println("Toplam Tutar:"+total);
		}else {
			System.out.println("Hatal� Veri Girdiniz");
		}
		inp.close();
	}

}
