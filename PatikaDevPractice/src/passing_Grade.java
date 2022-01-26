import java.util.Scanner;
public class passing_Grade {

	public static void main(String[] args) {
		int mat, turk,fiz, kim, music, fix=5;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz: ");
		mat = in.nextInt();
		if(mat>100 || mat<0) {
			System.out.println("hatalý giriþ yaptýnýz");
			mat=0;
			fix--;
		}

		System.out.println("Fizik notunuzu giriniz: ");
		fiz= in.nextInt();
		if(fiz>100 || fiz<0) {
			System.out.println("hatalý giriþ yaptýnýz");
			fiz=0;
			fix--;
		}
		

		System.out.println("Kimya notunuzu giriniz: ");
		kim = in.nextInt();
		if(kim>100 || kim<0) {
			System.out.println("hatalý giriþ yaptýnýz");
			kim=0;
			fix--;
		}
		

		System.out.println("Türkçe notunuzu giriniz: ");
		turk = in.nextInt();
		if(turk>100 || turk<0) {
			System.out.println("hatalý giriþ yaptýnýz");
			turk=0;
			fix--;
		}
	

		System.out.println("Müzik notunuzu giriniz: ");
		music = in.nextInt();
		if(music>100 || music<0) {
			System.out.println("hatalý giriþ yaptýnýz");
			music=0;
			fix--;
		}

		if(fix>0) {
		double average= (music+kim+turk+mat+fiz)/fix;
		if(average>=55) {
			System.out.println("Tebrikler sýnýfý geçtiniz ");
		}
		else {
			System.out.println("sýnýf tekrarý");
		}
		System.out.println("Ortalamanýz: "+average);

		}
		else {
			System.out.println("tüm notlar hatalý lütfen kontrol ediniz");
		}
		in.close();
	}

}
