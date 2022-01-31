import java.util.Scanner;
public class combination {

	public static void main(String[] args) {
		double n,r,nt=1,rt=1,nrt=1;
		double c;
		Scanner inp = new Scanner(System.in);
		System.out.println("Kombinasyonu alýnacak sayýyý giriniz ");
		n=inp.nextInt();
		System.out.println("kaçlý kombinasyonu alýnýcaðýný giriniz");
		r=inp.nextInt();
		inp.close();
		for(int i=1; i<=n;i++) {
			nt*=i;
		}
		System.out.println("nt= "+nt);
		for (int j=1; j<=r;j++) {
			rt*=j;
		}
		System.out.println("rt= "+rt);
		for(int k=1; k<=(n-r); k++) {
			nrt*=k;
		}
		System.out.println("nrt= "+nrt);
		
		c=nt/(rt*nrt);
		
		System.out.println("sonuç: "+c);

	}

}
