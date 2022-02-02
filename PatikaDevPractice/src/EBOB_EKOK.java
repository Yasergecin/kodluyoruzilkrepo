import java.util.Scanner;
public class EBOB_EKOK {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("ilk sayýyý giriniz");
		int n1=input.nextInt();
		
		System.out.println("ikinci sayýyý giriniz");
		int n2 =input.nextInt();
		int ebob=0;
		
		input.close();
		
		if(n1<n2) {
			int i=n1;
			do {
				
				if(n1%i==0 && n2%i==0) {
					ebob=i;
				}else {
					i--;
				}
			}while(ebob==0);
			
				
		}else {
			int j=n2;
			do {
				if(n1%j==0 && n2%j==0) {
					ebob=j;
				}else {
					j--;
				}
				
			}while(ebob==0);
		}
		System.out.println("ebob(obeb)= "+ebob);
		int ekok= (n1*n2)/ebob;
		System.out.println("ekok(okek)= "+ekok);
		
		

	}

}
