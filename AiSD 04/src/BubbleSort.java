public class BubbleSort {

	public static void sortuj(int[] tab) {
		int pom = 0;
		boolean posortowane = false;
		while(!posortowane) {
			posortowane = true;
			for (int i = 0; i < (tab.length - 1); i++) {
				if (tab[i] > tab[i+1]) {
					pom = tab[i+1];
					tab[i+1] = tab[i];
					tab[i] = pom;
					posortowane = false;
			}
		}
		}
		
	}

}
