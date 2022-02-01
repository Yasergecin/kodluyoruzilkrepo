import java.util.Scanner;
public class sum_Of_Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hesaplanacak sayýyý giriniz: ");
		int num=input.nextInt();
		int tempn=num;
		int value=0;
		input.close();
		while(tempn!=0) {
			value+=tempn%10;
			tempn=tempn/10;
			
		}
		System.out.println(num+ " Sayýsýnýn rakamlarý toplamý= "+value);

	}

}
