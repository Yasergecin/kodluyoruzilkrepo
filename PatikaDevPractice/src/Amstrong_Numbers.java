import java.util.Scanner;

public class Amstrong_Numbers {
	/* Armstrong Say� Nedir ?
N haneli bir say�n�n basamaklar�n�n n�inci �stlerinin toplam�, 
say�n�n kendisine e�itse, b�yle say�lara Armstrong say� denir.

�rne�in 407 say�s�n� ele alal�m. 
(4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. 
Bu da 407 say�s�n�n armstrong bir say� oldu�unu g�sterir.

1342 say�s�na da bakal�m. 
(1^4)+(3^4)+(4^4)+(2^4) 
=1+81+256+16=354 say�s� 1342�ye e�it olmad��� i�in armstrong say� olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Say� Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " say�s� bir Armstrong say�d�r.");
        } else {
            System.out.println(number + " say�s� bir Armstrong say�s� de�ildir.");
        }


        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Say�s� Bulma ��lemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir say�n�n son basama��n� bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */
        input.close();
        

	}

}
