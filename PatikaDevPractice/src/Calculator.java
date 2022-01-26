import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int n1, n2, select;
		Scanner in= new Scanner(System.in);
		
		System.out.println("iþlem yapýlacak ilk sayýyý giriniz: ");
		n1=in.nextInt();
		System.out.println("Ýþlem yapýlacak ikinci sayýyý giriniz");
		n2= in.nextInt();
		System.out.println("Yapýlack iþlemi seçiniz");
		System.out.println("toplama için 1\nçýkarma için 2\n çarpma için 3\n bölme için 4\n giriniz:");
		select=in.nextInt();
		
		switch(select) {
		case(1):
			System.out.println("Toplama iþlemini seçtiniz");
			System.out.println("Sayýlarýn toplamý= "+(n1+n2));
			break;
		case(2):
			System.out.println("Çýkarma iþlemini seçtiniz");
			System.out.println("Sayýlarýn farký= "+(n1-n2));
			break;
		case(3):
			System.out.println("Çarpma iþlemini seçtiniz");
			System.out.println("Sayýlarýn çarpýmý= "+(n1*n2));
			break;
		case(4):
			if(n2==0) {
				System.out.println("hatalý giriþ yaptýnýz");
				System.out.println("bir sayýnýn sýfýra bölümü sonsuzdur");
			}
			else {
				System.out.println("Bölme iþlemini seçtiniz");
				System.out.println("Ýki sayýnýn bölümü= "+(n1/n2));
			}
			break;
		default:
			System.out.println("hatalý giriþ Yaptýnýz lütfen tekrar deneyin");
			break;
		
		}
		in.close();

	}

}
