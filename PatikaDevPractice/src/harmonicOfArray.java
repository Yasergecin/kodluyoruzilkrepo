public class harmonicOfArray {

	public static void main(String[] args) {
		
		double[] numbers= {1,2,3,4,5,6,7};
		double harmonic = 0;
		for (int j=0; j<numbers.length; j++) {
			harmonic += 1.0/numbers[j];
		}
		double result = numbers.length/harmonic;
		
		System.out.println("Dizini harmonik ortalamasý = "+result);

	}

}
