import java.util.Scanner;
public class calculator_level_two {
	
	static void add() {
		Scanner scan= new Scanner(System.in);
		int counter, number, result=0;
		
		System.out.println("ka� adet say� toplanaca��n� giriniz: ");
		counter=scan.nextInt();
		
		for(int i=1; i<=counter; i++) {
		System.out.println(i+". say�y� giriniz: ");
		number=scan.nextInt();
		result+=number;
		}
		System.out.println("Sonu�= "+result+"\n");
		
		
	}
	
	static void sub() {
		Scanner scan= new Scanner(System.in);
		int counter, number, result=0;
		
		System.out.println("ka� adet say� kullan�laca��n� giriniz: ");
		counter=scan.nextInt();
		
		for(int i=1; i<=counter; i++) {
			System.out.println(i+". say�y� giriniz: ");
			number=scan.nextInt();
			if(i==1) {
				result=number;
				continue;
			}
			result-=number;
		}
		System.out.println("Sonu�= "+result+"\n");
		
	}
	static void mult() {
		int counter, number, result=1;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("ka� adet say� kullan�laca��n� giriniz: ");
		counter=scan.nextInt();
		
		for(int i=1;i<=counter; i++ ) {
			System.out.println(i+". say�y� giriniz: ");
			number=scan.nextInt();
			if(number==0){
				result=0;
				continue;
			}
			
			result*=number;
		}
		System.out.println("Sonu�= "+result+"\n");
		
	}
	static void devide() {
		int counter;
		Scanner scan= new Scanner(System.in);
		System.out.println("ka� adet say� kullan�laca��n� giriniz: ");
		counter=scan.nextInt();
		double  number, result=0.0;
		for(int i=1;i<=counter; i++ ) {
			System.out.println(i+". say�y� giriniz: ");
			number=scan.nextDouble();
			if(i!=1 && number==0) {
				System.out.println("B�leni 0 giremezsiniz.");
				continue;
			}
			if(i==1) {
				result=number;
				continue;
			}
			result/=number;
			
		}
		System.out.println("Sonu�= "+result+"\n");
		
		
	}
	
	static void exp() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Taban de�eri giriniz");
		int base =scan.nextInt();
		System.out.println("�s de�erini giriniz");
		int exp= scan.nextInt();
		int result=1;
		
		for(int i=1; i<=exp; i++) {
			result*=base;
		}
		System.out.println("Sonu�= "+result+"\n");
		
	}
	
	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Say� giriniz :");
		int n =scan.nextInt();
		int result=1;
		
		for(int i=1;i<=n; i++) {
			result*=i;
		}
		System.out.println("Sonu�= "+result+"\n");
		
	}
	
	static void mode() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Modu al�nacak say�y� giriniz :");
		int number=scan.nextInt();
		System.out.println("Modu giriniz");
		int mod= scan.nextInt();
		int result=number%mod;
		System.out.println("Sonu�= "+result+"\n");
		
	}
	
	static void rectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Uzun kenar�n �l��s�n� giriniz");
		int ln=scan.nextInt();
		System.out.println("k�sa kenar�n �l��s�n� giriniz");
		int srt=scan.nextInt();
		
		if(ln>0 && srt>0) {
		int alan =ln*srt;
		int cevre=2*(ln+srt);
		
		System.out.println("dikd�rtgen alan�= "+alan
				+"\nDikd�rtgenin �evresi = "+cevre+"\n");
		}else {
			System.out.println("Uzunluk eksi de�er alamaz\n");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yap";
        do {
    		System.out.println(menu);
    		System.out.print("L�tfen bir i�lem se�iniz :");
            select = scan.nextInt();
            switch (select) {
            case 1:
            	add();
            	break;
            case 2:
            	sub();
            	break;
            case 3:
            	mult();
            	break;
            case 4:
            	devide();
            	break;
            case 5:
            	exp();
            	break;
            case 6:
            	factorial();
            	break;
            case 7:
            	mode();
            	break;
            case 8:
            	rectangle();
            	break;
            case 0:
            	System.out.println("Tekrar g�r��mek �zere...\nHo��akal�n");
            	break;
            default:
            	System.out.println("Hatal� giri� yapt�n�z\n");
            	
            	}
    	}while(select!=0);
       

	}
	

}
