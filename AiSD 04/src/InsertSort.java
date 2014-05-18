
public class InsertSort {
	
	public static void sortuj(int[] tab){
		int pom = 0;
		for(int i = 1; i<tab.length; i++ ) {
			int j = i;
			while (j>0 && tab[j-1]>tab[j]) {
				pom = tab[j-1];
				tab[j-1] = tab[j];
				tab[j] = pom;
				j--;
			}
		}
	}
	
	
	

}
