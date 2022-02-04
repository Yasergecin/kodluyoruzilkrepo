import java.util.Scanner;
public class fibonacci_Serie {

	public static void main(String[] args) {
		int step=0, first=0,last=0,c=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Fibonacci adým sayýsýný giriniz");
		step= input.nextInt();
		input.close();
		for(int i=0; i<=step; i++){
			if(i==0) {
				first=0;
			}if(i==1) {
				last=1;
			}
			c=first+last;
			System.out.println(first+"+"+last+"="+ c);
			first=last;
			last=c;
		}
		

	}

}
