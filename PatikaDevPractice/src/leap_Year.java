import java.util.Scanner;

public class leap_Year {
	
	public static void main(String[] args) {
		int year, div, div2,div3;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Hesaplanacak y�l� giriniz");
		year=inp.nextInt();
		if(year>=0) {
			div=year%4;
			div2=year%100;
			div3=year%400;
			
			if(div==0) {
				if(div2==0) {
					if(div3!=0) {
						System.out.println(year+" bir art�k y�l de�ildir");
					}
					else {
						System.out.println(year+" bir art�k y�ld�r");
					}
				}else {
					System.out.println(year+" bir art�k y�ld�r");
				}
				
			}
			else {
				System.out.println(year+" bir art�k y�l de�ildir");
			}
		}
		else {
			System.out.println("hatal� bir tarih girdiniz");
			System.out.println("l�tfen y�l�n ba��na eksi i�areti koymadan giriniz");
		}
		inp.close();
	
}
}
