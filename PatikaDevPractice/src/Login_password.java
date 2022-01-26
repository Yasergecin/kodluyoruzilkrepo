import java.util.Scanner;
public class Login_password {

	public static void main(String[] args) {
		String password , userName;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Kullanýcý adýnýzý giriniz");
		userName=scan.nextLine();
		System.out.println("þifrenizi giriniz");
		password=scan.nextLine();
		
		if (userName.equals("patika")) {
			if(password.equals("java123")) {
				System.out.println("giriþ baþarýlý");
			}
			else {
				System.out.println("Hatalý giriþ");
				System.out.println("þifreniz hatalý!\n þifrenizi deðiþtirmek ister misiniz? ");
				System.out.println("evet için 1 hayýr için 0 a basýnýz");
				int change=scan.nextInt();
				
				if(change==0) {
					System.out.println("þifreniz deðiþmedi");
				}
				else if (change ==1){
					System.out.println("yeni þifrenizi giriniz");
					String yeni=scan.next();
					if(yeni.equals("java123")) {
						System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz");
					}
					else {
						password=yeni;
						System.out.println("Þifre oluþturuldu");
						
					}
				}
				else {
					System.out.println("Hatalý giriþ yaptýnýz");
				}
			}
		}else {
			System.out.println("hatalý kullanýcý adý ya da þifre ");
		}
		scan.close();

	}

}
