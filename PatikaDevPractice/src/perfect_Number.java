import java.util.Scanner;
public class perfect_Number {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Bir say� giriniz");
		int n=input.nextInt();
		int carpan=0;
		for(int i = 1; i<n; i++) {
			int a=n%i;
			if(a==0) {
				carpan+=i;
				System.out.println("i= "+i);
			}
		}
		if(carpan==n) {
			System.out.println(n+" bir m�kemmel say�d�r");
		}else {
			System.out.println(n+" bir m�kemmel say� de�ildir");
		}
input.close();
	}

}
