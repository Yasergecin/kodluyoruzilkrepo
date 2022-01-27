import java.util.Scanner;
public class basic_Sort {

	public static void main(String[] args) {
		int num, num1, num2;
		Scanner scan= new Scanner(System.in);
		System.out.println("Sıralanacak üç sayıyı giriniz");
		num= scan.nextInt();
		num1= scan.nextInt();
		num2= scan.nextInt();
		if (num>num1 && num>num2) {
			if(num1>num2) {
				System.out.println(num2+"<"+num1+"<"+num);
			}
			else {
				System.out.println(num1+"<"+num2+"<"+num);
			}
		}else if(num1>num && num1>num2) {
			if(num>num2) {
				System.out.println(num2+"<"+num+"<"+num1);
			}else {
				System.out.println(num+"<"+num2+"<"+num1);
			}
		}else if(num2>num && num2 >num1) {
			if(num>num1) {
				System.out.println(num1+"<"+num+"<"+num2);
			}else {
				System.out.println(num+"<"+num1+"<"+num2);
			}
		}
scan.close();
	}

}
