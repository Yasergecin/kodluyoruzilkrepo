import java.util.Scanner;
public class prime_with_Recursive {
	
	static boolean prime(int a ,int i) {
		int counter=2;
		if(a<=2) {
			return (a==2)? true:false;
		}
		if(a%i==0) {
			return false;
		}
		if (i*i>a) {
			return true;
		}
		return prime(a,i+1);
		
	}
			
		
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int a = scan.nextInt();
		boolean b=prime(a,2);
		String c= b ? "asal sayýdýr":"asal sayý deðildir";
		System.out.println(a+" sayýsý bir "+c);

	}

}
