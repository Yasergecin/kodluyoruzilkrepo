import java.util.Arrays;
import java.util.Scanner;

public class nearNumber {

	public static void main(String[] args) {
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		Scanner in = new Scanner(System.in);
		System.out.println("Bir Say� giriniz: ");
		int num=in.nextInt();
		System.out.println("Girilen Say�= "+num);
		in.close();
		
		int min= list[0];
		int max= list[0];
		
		Arrays.sort(list);
		
		for (int i=0; i<list.length; i++) {
			if(num>=list[i]) {
				min=list[i];
				max=list[i+1];
			}
		}
		System.out.println("Girilen say�dan k���k en yak�n say� :"+min);
		System.out.println("Girilen say�dan b�y�k en yak�n say� :"+max);
		
 
	}

}
