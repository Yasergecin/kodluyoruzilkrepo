import java.util.Scanner;
public class Activity_Offerer {

	public static void main(String[] args) {
		int heat;
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen hava sýcaklýðýný giriniz");
		heat= scan.nextInt();
		
		if(heat<5) {
			System.out.println("kayak yapmak için güzel bir hava");
		}else if(heat<15){
			System.out.println("sinemaya gitmek için güzel bir gün");
			
		}else if(heat<25) {
			System.out.println("Piknik yapmak için güzel bir gün");
		}else {
			System.out.println("Yüzmek için güzel bir gün");
		}
		scan.close();

	}

}
