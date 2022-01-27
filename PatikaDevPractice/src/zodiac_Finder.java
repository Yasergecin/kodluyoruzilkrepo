import java.util.Scanner;
public class zodiac_Finder {

	public static void main(String[] args) {
		int month, day;
		String sign = "hatalı giriş";
		Scanner input= new Scanner(System.in);
		
		System.out.println("Doğduğunuz ayı giriniz: ");
		month=input.nextInt();
		
		System.out.println("Doğduğunuz günü giriniz: ");
		day=input.nextInt();
		input.close();
		switch(month) {
		case(1):
			if(day>=1 && day<=31) {
				if(day<22) {
					sign="oğlak";
				}else {
					sign="kova";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(2):
			if(day>=1 && day<=29) {
				if (day<20) {
					sign="kova";
				}else {
					sign="balık";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(3):
			if(day>=1 && day<=31) {
				if(day<21) {
					sign="balık";
				}else {
					sign="koç";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(4):
			if(day>=1 && day<=30) {
				if(day<21) {
					sign="koç";
				}else {
					sign="boğa";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(5):
			if(day>=1 && day<=31) {
				if(day<22) {
					sign="boğa";
			}else {
				sign="ikizler";
			}
		}else {
			System.out.println("hatalı gün girdiniz");
		}
	break;
		case(6):
			if(day>=1 && day<=30) {
				if(day<23) {
					sign="ikizler";
				}else {
					sign="yengeç";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(7):
			if(day>=1 && day<=31) {
				if(day<23) {
					sign="yengeç";
				}else {
					sign="aslan";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(8):
			if(day>=1 && day<=31) {
				if(day<23) {
					sign="aslan";
				}else {
					sign="başak";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(9):
			if(day>=1 && day<=30) {
				if(day<23) {
					sign="başak";
				}else {
					sign="terazi";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
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
				System.out.println("hatalı gün girdiniz");
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
				System.out.println("hatalı gün girdiniz");
			}
		break;
		case(12):
			if(day>=1 && day<=31) {
				if(day<22) {
					sign="yay";
				}else {
					sign="oğlak";
				}
			}else {
				System.out.println("hatalı gün girdiniz");
			}
		break;
		default: 
			System.out.println("hatalı giriş yaptınız");
		}
		System.out.println("burcunuz: "+sign);

	}

}
