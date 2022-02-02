import java.util.Scanner;
public class perfect_Number {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz");
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
			System.out.println(n+" bir mükemmel sayýdýr");
		}else {
			System.out.println(n+" bir mükemmel sayý deðildir");
		}
input.close();
	}

}
