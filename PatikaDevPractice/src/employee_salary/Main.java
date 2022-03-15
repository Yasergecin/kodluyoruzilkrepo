package employee_salary;

import java.util.*;
import java.io.*;


public class Main {

	public static boolean PrimeTime(int a,int i) {
	    if(a<=2) {
				return (a==2)? true:false;
			}
			if(a%i==0) {
				return false;
			}
			if (i*i>a) {
				return true;
			}
			return PrimeTime(a,i+1);
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(PrimeTime(s.nextInt(),2)); 
	  }

}
