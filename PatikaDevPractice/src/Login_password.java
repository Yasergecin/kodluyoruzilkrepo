import java.util.Scanner;
public class Login_password {

	public static void main(String[] args) {
		String password , userName;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�n�z� giriniz");
		userName=scan.nextLine();
		System.out.println("�ifrenizi giriniz");
		password=scan.nextLine();
		
		if (userName.equals("patika")) {
			if(password.equals("java123")) {
				System.out.println("giri� ba�ar�l�");
			}
			else {
				System.out.println("Hatal� giri�");
				System.out.println("�ifreniz hatal�!\n �ifrenizi de�i�tirmek ister misiniz? ");
				System.out.println("evet i�in 1 hay�r i�in 0 a bas�n�z");
				int change=scan.nextInt();
				
				if(change==0) {
					System.out.println("�ifreniz de�i�medi");
				}
				else if (change ==1){
					System.out.println("yeni �ifrenizi giriniz");
					String yeni=scan.next();
					if(yeni.equals("java123")) {
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz");
					}
					else {
						password=yeni;
						System.out.println("�ifre olu�turuldu");
						
					}
				}
				else {
					System.out.println("Hatal� giri� yapt�n�z");
				}
			}
		}else {
			System.out.println("hatal� kullan�c� ad� ya da �ifre ");
		}
		scan.close();

	}

}
