package boxing_match;

public class Main {

	public static void main(String[] args) {
	      Fighter marc = new Fighter("Marc" , 15 , 100, 90, 25);
	      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 35);
	      Match r = new Match(marc,alex , 90 , 100);
	      r.run();
	    }

}
