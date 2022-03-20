
public class bWordPrinter {

	public static void main(String[] args) {
		String[][] word= new String[7][4];//daha iyi görüntü vermesi için 7 satır yapıldı
		                                  //for to give better image its made 7 rows
		
		for(int i=0; i<word.length; i++) {
			for(int j=0; j<word[i].length; j++) {
				if(i==0 || i== 3 || i==6) {
					word[i][j]=" *";
				}
				else if(j==0||j==3) {
					word[i][j]=" * ";
				}
				else {
					word[i][j]="  ";
				}
			}
		}
		for (String[] row : word){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

	}

}
