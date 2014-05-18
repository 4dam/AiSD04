import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) {
		final int dlugosc = 1000;
		int[] losowa = new int[dlugosc];
		int[] rosnaca = new int[dlugosc];
		int[] malejaca = new int[dlugosc];
		int[] tab = new int[dlugosc];
		
		for (int i = 0; i < dlugosc-1; i++) {
			losowa[i] = (int) (Math.random()*dlugosc);
		}
		
		for (int i = 0; i < dlugosc-1; i++) {
			rosnaca[i] = i;
		}
		
		for(int i = 0; i < dlugosc-1; i++) {
			malejaca[i] = dlugosc - i;
		}
		
		System.out.println("BubbleSort:");
		System.arraycopy(losowa, 0, tab, 0, dlugosc);
		long bubblestart1 = System.nanoTime();
		BubbleSort.sortuj(tab);
		long bubblestop1 = System.nanoTime();
		System.out.println((bubblestop1 - bubblestart1)/1000000d + "ms");
		
		System.arraycopy(rosnaca, 0, tab, 0, dlugosc);
		long bubblestart2 = System.nanoTime();
		BubbleSort.sortuj(tab);
		long bubblestop2 = System.nanoTime();
		System.out.println((bubblestop2 - bubblestart2)/1000000d + "ms");
		
		System.arraycopy(malejaca, 0, tab, 0, dlugosc);
		long bubblestart3 = System.nanoTime();
		BubbleSort.sortuj(tab);
		long bubblestop3 = System.nanoTime();
		System.out.println((bubblestop3 - bubblestart3)/1000000d + "ms");
		
		
		System.out.println("selectSort:");
		System.arraycopy(losowa, 0, tab, 0, dlugosc);
		long selectstart1 = System.nanoTime();
		SelectSort.sortuj(tab);
		long selectstop1 = System.nanoTime();
		System.out.println((selectstop1 - selectstart1)/1000000d + "ms");
		
		System.arraycopy(rosnaca, 0, tab, 0, dlugosc);
		long selectstart2 = System.nanoTime();
		SelectSort.sortuj(tab);
		long selectstop2 = System.nanoTime();
		System.out.println((selectstop2 - selectstart2)/1000000d + "ms");
		
		System.arraycopy(malejaca, 0, tab, 0, dlugosc);
		long selectstart3 = System.nanoTime();
		SelectSort.sortuj(tab);
		long selectstop3 = System.nanoTime();
		System.out.println((selectstop3 - selectstart3)/1000000d + "ms");

		System.out.println("InsertSort:");
		System.arraycopy(losowa, 0, tab, 0, dlugosc);
		long insertstart1 = System.nanoTime();
		InsertSort.sortuj(tab);
		long insertstop1 = System.nanoTime();
		System.out.println((insertstop1 - insertstart1)/1000000d + "ms");

		System.arraycopy(rosnaca, 0, tab, 0, dlugosc);
		long insertstart2 = System.nanoTime();
		InsertSort.sortuj(tab);
		long insertstop2 = System.nanoTime();
		System.out.println((insertstop2 - insertstart2)/1000000d + "ms");
		
		System.arraycopy(malejaca, 0, tab, 0, dlugosc);
		long insertstart3 = System.nanoTime();
		InsertSort.sortuj(tab);
		long insertstop3 = System.nanoTime();
		System.out.println((insertstop3 - insertstart3)/1000000d + "ms");
		

		
		System.out.println("ShellSort:");
		System.arraycopy(losowa, 0, tab, 0, dlugosc);
		long shellstart1 = System.nanoTime();
		ShellSort.sortuj(tab);
		long shellstop1 = System.nanoTime();
		System.out.println((shellstop1 - shellstart1)/1000000d + "ms");

		System.arraycopy(rosnaca, 0, tab, 0, dlugosc);
		long shellstart2 = System.nanoTime();
		ShellSort.sortuj(tab);
		long shellstop2 = System.nanoTime();
		System.out.println((shellstop2 - shellstart2)/1000000d + "ms");

		System.arraycopy(malejaca, 0, tab, 0, dlugosc);
		long shellstart3 = System.nanoTime();
		ShellSort.sortuj(tab);
		long shellstop3 = System.nanoTime();
		System.out.println((shellstop3 - shellstart3)/1000000d + "ms");
		
		
		
		System.out.println("Arrays.sort():");
		System.arraycopy(losowa, 0, tab, 0, dlugosc);
		long arraystart1 = System.nanoTime();
		Arrays.sort(tab);
		long arraystop1 = System.nanoTime();
		System.out.println((arraystop1 - arraystart1)/1000000d + "ms");

		System.arraycopy(rosnaca, 0, tab, 0, dlugosc);
		long arraystart2 = System.nanoTime();
		Arrays.sort(tab);
		long arraystop2 = System.nanoTime();
		System.out.println((arraystop2 - arraystart2)/1000000d + "ms");

		System.arraycopy(malejaca, 0, tab, 0, dlugosc);
		long arraystart3 = System.nanoTime();
		Arrays.sort(tab);
		long arraystop3 = System.nanoTime();
		System.out.println((arraystop3 - arraystart3)/1000000d + "ms");
		
	System.out.printf("|%15s||%18s|%18s|%18s|%n","Algorytm","Losowe", "Rosnace", "Malejace");	
	System.out.println("---------------------------------------------------------------------------");
	System.out.printf("|%15s||%15.4f ms|%15.4f ms|%15.4f ms|%n","BubbleSort",(bubblestop1 - bubblestart1)/1000000d, (bubblestop2 - bubblestart2)/1000000d, (bubblestop3 - bubblestart3)/1000000d);	
	System.out.printf("|%15s||%15.4f ms|%15.4f ms|%15.4f ms|%n", "SelectSort", (selectstop1 - selectstart1)/1000000d, (selectstop2 - selectstart2)/1000000d, (selectstop3 - selectstart3)/1000000d);
	System.out.printf("|%15s||%15.4f ms|%15.4f ms|%15.4f ms|%n", "InsertSort", (insertstop1 - insertstart1)/1000000d, (insertstop2 - insertstart2)/1000000d, (insertstop3 - insertstart3)/1000000d);
	System.out.printf("|%15s||%15.4f ms|%15.4f ms|%15.4f ms|%n", "ShellSort", (shellstop1 - shellstart1)/1000000d, (shellstop2 - shellstart2)/1000000d, (shellstop3 - shellstart3)/1000000d);
	System.out.printf("|%15s||%15.4f ms|%15.4f ms|%15.4f ms|%n", "Arrays.sort", (arraystop1 - arraystart1)/1000000d, (arraystop2 - arraystart2)/1000000d, (arraystop3 - arraystart3)/1000000d);
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
