import java.util.Scanner;
public class passing_Grade {

	public static void main(String[] args) {
		int mat, turk,fiz, kim, music, fix=5;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz: ");
		mat = in.nextInt();
		if(mat>100 || mat<0) {
			System.out.println("hatal� giri� yapt�n�z");
			mat=0;
			fix--;
		}

		System.out.println("Fizik notunuzu giriniz: ");
		fiz= in.nextInt();
		if(fiz>100 || fiz<0) {
			System.out.println("hatal� giri� yapt�n�z");
			fiz=0;
			fix--;
		}
		

		System.out.println("Kimya notunuzu giriniz: ");
		kim = in.nextInt();
		if(kim>100 || kim<0) {
			System.out.println("hatal� giri� yapt�n�z");
			kim=0;
			fix--;
		}
		

		System.out.println("T�rk�e notunuzu giriniz: ");
		turk = in.nextInt();
		if(turk>100 || turk<0) {
			System.out.println("hatal� giri� yapt�n�z");
			turk=0;
			fix--;
		}
	

		System.out.println("M�zik notunuzu giriniz: ");
		music = in.nextInt();
		if(music>100 || music<0) {
			System.out.println("hatal� giri� yapt�n�z");
			music=0;
			fix--;
		}

		if(fix>0) {
		double average= (music+kim+turk+mat+fiz)/fix;
		if(average>=55) {
			System.out.println("Tebrikler s�n�f� ge�tiniz ");
		}
		else {
			System.out.println("s�n�f tekrar�");
		}
		System.out.println("Ortalaman�z: "+average);

		}
		else {
			System.out.println("t�m notlar hatal� l�tfen kontrol ediniz");
		}
		in.close();
	}

}
