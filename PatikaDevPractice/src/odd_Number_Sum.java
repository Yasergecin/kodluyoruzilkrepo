import java.util.Scanner;
public class odd_Number_Sum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner inp = new Scanner(System.in);
		
		do {
			System.out.println("Bir sayý giriniz");
			n=inp.nextInt();
			if(n%2==0) {
				sum+=n;
			}
		}
		while(n%2==0); 
		inp.close();
		System.out.println("Girilen sayýlarýn toplamý= "+sum);
	}

}
