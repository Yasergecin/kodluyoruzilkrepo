import java.util.Scanner;
public class harmonic_Serie {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num=input.nextInt();
		input.close();
		double result=0;
		for(int i=1; i<=num; i++) {
			result+=1.0/i;
		}
		System.out.println("The harmonic serie's value= "+result);

	}

}
