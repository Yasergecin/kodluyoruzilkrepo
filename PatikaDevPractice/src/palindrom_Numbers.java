import java.util.Scanner;
public class palindrom_Numbers {
	static boolean palindrom(int number){
		int last, temp, reverse=0;
		temp=number;
		while(temp!=0) {
		last=temp%10;
		reverse=reverse*10+last;
		
		temp/=10;
		}
		if(reverse==number) {
		return true;
		}
		else {return false;}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int a=input.nextInt();
		
		boolean b=palindrom(a);
		
		String deger = b? "sayıdır":"sayı değildir";
		
		System.out.println(a+" bir palindrom "+deger);
		input.close();
	}

}
