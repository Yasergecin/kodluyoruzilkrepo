import java.util.Scanner;

public class min_Max_finder {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int max=0, min=0;
		System.out.println("kaç adet sayý gireceksiniz: ");
		int adet=input.nextInt();
		if (adet<=0) {
			System.out.println("Hatalý giriþ");
		}else {
			for(int i=0; i<adet; i++) {
				System.out.println("Sayýyý giriniz");
				int a=input.nextInt();
				
				if(max<a) {
					max=a;
					if(min==0) {
						min=a;
					}
				}
				if(min>a) {
					min=a;
				}
				
			}
			System.out.println("En büyük deðer= "+max);
			System.out.println("en küçük deðer= "+min);
		}
		input.close();

	}

}
