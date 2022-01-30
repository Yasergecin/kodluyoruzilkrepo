import java.util.Scanner;
public class Exponents {

	public static void main(String[] args) {
		int num;
		Scanner inp= new Scanner(System.in);
		
		System.out.println("Hesaplanacak sayýyý giriniz");
		num=inp.nextInt();
		inp.close();
		System.out.println("0'dan "+num+ "' e kadar 4'ün kuvvetleri= ");
		for(int i=1; i<=num; i*=4) {
			System.out.print(i+",");
	}
		System.out.println();
		System.out.println("0'dan "+num+ "' e kadar 5'in kuvvetleri= ");
		for(int j=1; j<=num; j*=5) {
			System.out.print(j+",");
		}

}
}
