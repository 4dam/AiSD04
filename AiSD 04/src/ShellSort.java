
public class ShellSort {

	public static void sortuj(int[] tab) {
		for (int gap = tab.length/2; gap > 0; gap/=2) {
			for (int i = gap; i < tab.length; i++) {
				int pom = tab[i];
				int j = 0;
				for(j = i; j>=gap && tab[j-gap] > pom; j-=gap) {
					tab[j] = tab[j-gap];
				}
				tab[j] = pom;
			}
		}
		
		
	}
	
	
	
	
}
