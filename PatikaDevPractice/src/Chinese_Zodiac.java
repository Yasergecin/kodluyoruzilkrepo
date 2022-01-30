import java.util.Scanner;
public class Chinese_Zodiac {

	public static void main(String[] args) {
		int year, div;
		String burc="";
		Scanner inp= new Scanner(System.in);
		
		System.out.println("doðum tarihinizi giriniz");
		System.out.println("M.Ö yýllar için de sadece yýlý yazýnýz");
		year=inp.nextInt();
		div=year%12;
		if(year>=0) {
		switch(div) {
		case(0):
			burc="Maymun";
		break;
		case(1):
			burc="Horoz";
		break;
		case(2):
			burc="Köpek";
		break;
		case(3):
			burc="Domuz";
		break;
		case(4):
			burc= "Fare";
		break;
		case(5):
			burc= "Öküz";
		break;
		case(6):
			burc="Kaplan" ;
		break;
		case(7):
			burc="Tavþan" ;
		break;
		case(8):
			burc= "Ejderha";
		break;
		case(9):
			burc= "Yýlan";
		break;
		case(10):
			burc= "At";
		break;
		case(11):
			burc= "Koyun";
		break;
		default:
			System.out.println("hatalý bir tarih girdiniz");
			burc="hatalý bir giriþ yaptýnýz";
		}
		System.out.println("Doðduðunuz yýl "+burc+" yýlýdýr.");
		}
		else {
			System.out.println("hatalý bir tarih girdiniz");
			System.out.println("lütfen baþýna eksi iþareti koymadan giriniz");
		}
		inp.close();

	}

}
