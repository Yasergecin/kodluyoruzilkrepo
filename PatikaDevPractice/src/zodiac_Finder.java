import java.util.Scanner;
public class zodiac_Finder {

	public static void main(String[] args) {
		int month, day;
		String sign = "hatal� giri�";
		Scanner input= new Scanner(System.in);
		
		System.out.println("Do�du�unuz ay� giriniz: ");
		month=input.nextInt();
		
		System.out.println("Do�du�unuz g�n� giriniz: ");
		day=input.nextInt();
		input.close();
		switch(month) {
		case(1):
			if(day>=1 && day<=31) {
				if(day<22) {
					sign="o�lak";
				}else {
					sign="kova";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(2):
			if(day>=1 && day<=29) {
				if (day<20) {
					sign="kova";
				}else {
					sign="bal�k";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(3):
			if(day>=1 && day<=31) {
				if(day<21) {
					sign="bal�k";
				}else {
					sign="ko�";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(4):
			if(day>=1 && day<=30) {
				if(day<21) {
					sign="ko�";
				}else {
					sign="bo�a";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(5):
			if(day>=1 && day<=31) {
				if(day<22) {
					sign="bo�a";
			}else {
				sign="ikizler";
			}
		}else {
			System.out.println("hatal� g�n girdiniz");
		}
	break;
		case(6):
			if(day>=1 && day<=30) {
				if(day<23) {
					sign="ikizler";
				}else {
					sign="yenge�";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(7):
			if(day>=1 && day<=31) {
				if(day<23) {
					sign="yenge�";
				}else {
					sign="aslan";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(8):
			if(day>=1 && day<=31) {
				if(day<23) {
					sign="aslan";
				}else {
					sign="ba�ak";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(9):
			if(day>=1 && day<=30) {
				if(day<23) {
					sign="ba�ak";
				}else {
					sign="terazi";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(10):
			if(day>=1 && day<=31) {
				if(day<23) {
					sign="terazi";
				}else {
					sign="akrep";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(11):
			if(day>=1 && day<=30) {
				if(day<22) {
					sign="akrep";
				}else {
					sign="yay";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		case(12):
			if(day>=1 && day<=31) {
				if(day<22) {
					sign="yay";
				}else {
					sign="o�lak";
				}
			}else {
				System.out.println("hatal� g�n girdiniz");
			}
		break;
		default: 
			System.out.println("hatal� giri� yapt�n�z");
		}
		System.out.println("burcunuz: "+sign);

	}

}
