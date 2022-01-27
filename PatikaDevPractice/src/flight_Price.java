import java.util.Scanner;
public class flight_Price {

	public static void main(String[] args) {
		double dist;
		int age, type;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Lütfen gidilecek mesafeyi giriniz: ");
		dist=inp.nextDouble();
		
		System.out.println("Lütfen yolcunun yaþýný giriniz: ");
		age=inp.nextInt();
		
		System.out.println("Lütfen yolculuk tipini seçiniz");
		System.out.println("Tek Yön için: 1, Gidiþ-Dönüþ için 2 giriniz");
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
			System.out.println("Hatalý Veri Girdiniz");
		}
		inp.close();
	}

}
