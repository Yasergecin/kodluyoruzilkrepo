import java.util.Scanner;

public class recursive_Exponent {
	
	static int exp(int base, int exp) {
		if(exp==0) {
			return 1;
		}else {
			int res=1;
			res=base*exp(base,(exp-1));
		return res;
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("taban de�erini giriniz");
		int a=scan.nextInt();
		System.out.println("�s de�erini girniz");
		int b= scan.nextInt();
		System.out.println("sonu�= " +exp(a,b));
		scan.close();

	}

}
