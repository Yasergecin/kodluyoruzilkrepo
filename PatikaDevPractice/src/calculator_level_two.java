import java.util.Scanner;
public class calculator_level_two {
	
	static void add() {
		Scanner scan= new Scanner(System.in);
		int counter, number, result=0;
		
		System.out.println("kaç adet sayý toplanacaðýný giriniz: ");
		counter=scan.nextInt();
		
		for(int i=1; i<=counter; i++) {
		System.out.println(i+". sayýyý giriniz: ");
		number=scan.nextInt();
		result+=number;
		}
		System.out.println("Sonuç= "+result+"\n");
		
		
	}
	
	static void sub() {
		Scanner scan= new Scanner(System.in);
		int counter, number, result=0;
		
		System.out.println("kaç adet sayý kullanýlacaðýný giriniz: ");
		counter=scan.nextInt();
		
		for(int i=1; i<=counter; i++) {
			System.out.println(i+". sayýyý giriniz: ");
			number=scan.nextInt();
			if(i==1) {
				result=number;
				continue;
			}
			result-=number;
		}
		System.out.println("Sonuç= "+result+"\n");
		
	}
	static void mult() {
		int counter, number, result=1;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("kaç adet sayý kullanýlacaðýný giriniz: ");
		counter=scan.nextInt();
		
		for(int i=1;i<=counter; i++ ) {
			System.out.println(i+". sayýyý giriniz: ");
			number=scan.nextInt();
			if(number==0){
				result=0;
				continue;
			}
			
			result*=number;
		}
		System.out.println("Sonuç= "+result+"\n");
		
	}
	static void devide() {
		int counter;
		Scanner scan= new Scanner(System.in);
		System.out.println("kaç adet sayý kullanýlacaðýný giriniz: ");
		counter=scan.nextInt();
		double  number, result=0.0;
		for(int i=1;i<=counter; i++ ) {
			System.out.println(i+". sayýyý giriniz: ");
			number=scan.nextDouble();
			if(i!=1 && number==0) {
				System.out.println("Böleni 0 giremezsiniz.");
				continue;
			}
			if(i==1) {
				result=number;
				continue;
			}
			result/=number;
			
		}
		System.out.println("Sonuç= "+result+"\n");
		
		
	}
	
	static void exp() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Taban deðeri giriniz");
		int base =scan.nextInt();
		System.out.println("Üs deðerini giriniz");
		int exp= scan.nextInt();
		int result=1;
		
		for(int i=1; i<=exp; i++) {
			result*=base;
		}
		System.out.println("Sonuç= "+result+"\n");
		
	}
	
	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayý giriniz :");
		int n =scan.nextInt();
		int result=1;
		
		for(int i=1;i<=n; i++) {
			result*=i;
		}
		System.out.println("Sonuç= "+result+"\n");
		
	}
	
	static void mode() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Modu alýnacak sayýyý giriniz :");
		int number=scan.nextInt();
		System.out.println("Modu giriniz");
		int mod= scan.nextInt();
		int result=number%mod;
		System.out.println("Sonuç= "+result+"\n");
		
	}
	
	static void rectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Uzun kenarýn ölçüsünü giriniz");
		int ln=scan.nextInt();
		System.out.println("kýsa kenarýn ölçüsünü giriniz");
		int srt=scan.nextInt();
		
		if(ln>0 && srt>0) {
		int alan =ln*srt;
		int cevre=2*(ln+srt);
		
		System.out.println("dikdörtgen alaný= "+alan
				+"\nDikdörtgenin çevresi = "+cevre+"\n");
		}else {
			System.out.println("Uzunluk eksi deðer alamaz\n");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Ýþlemi\n"
                + "2- Çýkarma Ýþlemi\n"
                + "3- Çarpma Ýþlemi\n"
                + "4- Bölme iþlemi\n"
                + "5- Üslü Sayý Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabý\n"
                + "0- Çýkýþ Yap";
        do {
    		System.out.println(menu);
    		System.out.print("Lütfen bir iþlem seçiniz :");
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
            	System.out.println("Tekrar görüþmek üzere...\nHoþçakalýn");
            	break;
            default:
            	System.out.println("Hatalý giriþ yaptýnýz\n");
            	
            	}
    	}while(select!=0);
       

	}
	

}
