
public class SelectSort {
	
	public static void sortuj(int[] tab){
		int pom = 0;
		for(int i = 0; i<tab.length-1; i++) {
			int min=i;
			for (int j = i+1; j<tab.length; j++ ) {
				if(tab[j] < tab[min]) min = j;
			}
			pom = tab[i];
			tab[i] = tab[min];
			tab[min] = pom;
		}
		
	}
	

}
