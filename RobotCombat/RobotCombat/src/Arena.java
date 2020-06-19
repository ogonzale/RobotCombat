import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arena {
	
	private static Fato fato;
	private ArrayList<Robot> robots;

	public Arena(Fato fato, ArrayList<Robot> robots) {
		Arena.fato = fato;
		this.robots = robots;
	}
	public Set<Robot> seleccionaRobots() {

		Set<Robot> combattente = new HashSet<Robot>();
		while(combattente.size()<2) {
			combattente.add(robots.get(fato.generaNumeroPositivo(robots.size())));
			combattente.add(robots.get(fato.generaNumeroPositivo(robots.size())));
		}
		
		return combattente;
	}
	public ArrayList<Robot> getRobots() {
		return robots;
	}
	public void setRobots(ArrayList<Robot> robots) {
		this.robots = robots;
	}
	
	
}
