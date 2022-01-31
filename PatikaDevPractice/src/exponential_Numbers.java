import java.util.Scanner;
public class exponential_Numbers {

	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		double total=1;
		System.out.println("Üssü alýnacak sayýyý giriniz ");
		double n=inp.nextDouble();
		System.out.println("Sayýnýn üssünü(kuvvet) giriniz ");
		int k= inp.nextInt();
		inp.close();
		for (int i=0;i<k;i++) {
			 total *= n;
		}
		System.out.println(n+" sayýsýnýn "+k+" nci kuvveti=  "+total);
	}

}
