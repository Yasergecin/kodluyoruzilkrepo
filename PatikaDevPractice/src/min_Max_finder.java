import java.util.Scanner;

public class min_Max_finder {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int max=0, min=0;
		System.out.println("ka� adet say� gireceksiniz: ");
		int adet=input.nextInt();
		if (adet<=0) {
			System.out.println("Hatal� giri�");
		}else {
			for(int i=0; i<adet; i++) {
				System.out.println("Say�y� giriniz");
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
			System.out.println("En b�y�k de�er= "+max);
			System.out.println("en k���k de�er= "+min);
		}
		input.close();

	}

}
