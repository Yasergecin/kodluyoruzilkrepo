import java.util.Scanner;
public class Taximeter {

	public static void main(String[] args) {
		int min=20;
		double km;
		double tutar=10;
		Scanner in = new Scanner(System.in);
		
		System.out.print("gidilecek mesafeyi KM cinsinde yaz�n�z: ");
		km=in.nextDouble();
		
		tutar += km*2.20;
		
		double son= tutar<=min ? min : tutar;
		
		System.out.println("�denecek Tutar= "+son);
		

	}

}
