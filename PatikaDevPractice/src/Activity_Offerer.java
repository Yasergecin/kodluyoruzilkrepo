import java.util.Scanner;
public class Activity_Offerer {

	public static void main(String[] args) {
		int heat;
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen hava s�cakl���n� giriniz");
		heat= scan.nextInt();
		
		if(heat<5) {
			System.out.println("kayak yapmak i�in g�zel bir hava");
		}else if(heat<15){
			System.out.println("sinemaya gitmek i�in g�zel bir g�n");
			
		}else if(heat<25) {
			System.out.println("Piknik yapmak i�in g�zel bir g�n");
		}else {
			System.out.println("Y�zmek i�in g�zel bir g�n");
		}
		scan.close();

	}

}
