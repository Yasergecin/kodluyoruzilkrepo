import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int n1, n2, select;
		Scanner in= new Scanner(System.in);
		
		System.out.println("i�lem yap�lacak ilk say�y� giriniz: ");
		n1=in.nextInt();
		System.out.println("��lem yap�lacak ikinci say�y� giriniz");
		n2= in.nextInt();
		System.out.println("Yap�lack i�lemi se�iniz");
		System.out.println("toplama i�in 1\n��karma i�in 2\n �arpma i�in 3\n b�lme i�in 4\n giriniz:");
		select=in.nextInt();
		
		switch(select) {
		case(1):
			System.out.println("Toplama i�lemini se�tiniz");
			System.out.println("Say�lar�n toplam�= "+(n1+n2));
			break;
		case(2):
			System.out.println("��karma i�lemini se�tiniz");
			System.out.println("Say�lar�n fark�= "+(n1-n2));
			break;
		case(3):
			System.out.println("�arpma i�lemini se�tiniz");
			System.out.println("Say�lar�n �arp�m�= "+(n1*n2));
			break;
		case(4):
			if(n2==0) {
				System.out.println("hatal� giri� yapt�n�z");
				System.out.println("bir say�n�n s�f�ra b�l�m� sonsuzdur");
			}
			else {
				System.out.println("B�lme i�lemini se�tiniz");
				System.out.println("�ki say�n�n b�l�m�= "+(n1/n2));
			}
			break;
		default:
			System.out.println("hatal� giri� Yapt�n�z l�tfen tekrar deneyin");
			break;
		
		}
		in.close();

	}

}
