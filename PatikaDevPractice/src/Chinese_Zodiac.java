import java.util.Scanner;
public class Chinese_Zodiac {

	public static void main(String[] args) {
		int year, div;
		String burc="";
		Scanner inp= new Scanner(System.in);
		
		System.out.println("do�um tarihinizi giriniz");
		System.out.println("M.� y�llar i�in de sadece y�l� yaz�n�z");
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
			burc="K�pek";
		break;
		case(3):
			burc="Domuz";
		break;
		case(4):
			burc= "Fare";
		break;
		case(5):
			burc= "�k�z";
		break;
		case(6):
			burc="Kaplan" ;
		break;
		case(7):
			burc="Tav�an" ;
		break;
		case(8):
			burc= "Ejderha";
		break;
		case(9):
			burc= "Y�lan";
		break;
		case(10):
			burc= "At";
		break;
		case(11):
			burc= "Koyun";
		break;
		default:
			System.out.println("hatal� bir tarih girdiniz");
			burc="hatal� bir giri� yapt�n�z";
		}
		System.out.println("Do�du�unuz y�l "+burc+" y�l�d�r.");
		}
		else {
			System.out.println("hatal� bir tarih girdiniz");
			System.out.println("l�tfen ba��na eksi i�areti koymadan giriniz");
		}
		inp.close();

	}

}
