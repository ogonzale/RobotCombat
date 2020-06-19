

import java.util.Random;

public class Fato {
	
	public int generaNumeroPositivo(Integer length) {
		
		Random rand = new Random();

		// genera un numero a caso tra 0 e length
		int n = rand.nextInt(length);

//		System.out.println(n);
		return n;
	}
	public int generaNumero(Integer length) {
		
		Random rand = new Random();

		// genera un numero a caso tra -length e length
		int n = rand.nextInt(length*2)-(length);

//		System.out.println(n);
		return n;
	}
	



}
