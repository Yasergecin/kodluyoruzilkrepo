import java.util.Scanner;

public class even_Numbers {
	public static void main(String[] args) {
	
		double num, sum = 0, counter=0;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Sayý giriniz");
		num=inp.nextInt();
		inp.close();
		for (int i=1;i<=num;i++) {
			
			
			if(i%3==0 || i%4==0) {
				sum += i;
				counter++;
				System.out.println("i sayýsý= "+i);
			}
			
		}

		double average=sum/counter;
		System.out.println("3 veya 4 e bölünebilen sayýlarýn oratalamasý= "+average);
	}
}

