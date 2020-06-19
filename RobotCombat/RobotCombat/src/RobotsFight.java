/**
 * @param titulo Prova di verifica di JAVA OPP.
 * 
 * @author Otto Gonzalez
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;
import java.util.Set;

public class RobotsFight {

	public static void main(String[] args) {
				
		
		System.out.println("Buongiorno");
/**		
 * @param rand viene inizializzato, lui è un parametro aleatorio, 
 * che viene definito nella clase Fato.
 **/
		Fato rand = new Fato();
		
/**
 * 		@param factory, viene creata la lista delle fabbriche
 */
		RobotFactory factory = new RobotFactory(rand);

//		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Qual è il numero di contendenti(numero intero positivo, divisibile per due): ");
		int numRobots = keyboard.nextInt();
		keyboard.close();

		
		ArrayList<Robot> robots = new ArrayList<Robot>();
		for (int fabbrica = 0; fabbrica < numRobots; fabbrica++) {
			System.out.println("Fabbrica " + fabbrica);
			
			for(int robotCount = 1; robots.size() < numRobots; robotCount++) {
				System.out.println("Creazione robot " + robotCount);
				robots.add(factory.crea());
				if (robotCount%2 ==0) {
					int b = rand.generaNumeroPositivo(2);
					if (b == 0) {
						System.out.println("BOOOM!!!");
						// Fabbrica esplode!!!BOOM
						break;
					}
					
				}
				
			}
			
		}
		
		
		System.out.println("Il numero totale di robots e: " + robots.size());		
		robots.forEach(r -> System.out.println(r.toString()));

		Arena arena = new Arena(rand, robots);
		Set<Robot> combattente = arena.seleccionaRobots();
		
		System.out.println("The Figther are: ");
		combattente.forEach(r -> System.out.println(r.toString()));
		

	}

}