import java.util.Scanner;

public class method_by_Pattern {

	static int method(int number,int counter) {
		
		if(number>0) {
			System.out.print(number+" ");
			number-=5;
			counter++;
			return method (number,counter);
		}
		System.out.print(number+" ");
		return method2(number,counter);
		
			//return method2(number,counter);
		

	}
	static int method2(int number,int counter) {
			if(counter>1){
			number+=5;
			counter--;
			System.out.print(number+" ");
			return method2(number,counter);
			}
			return number+5;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int a=scan.nextInt();
		
		System.out.println(method(a,0));
		scan.close();

	}

}
