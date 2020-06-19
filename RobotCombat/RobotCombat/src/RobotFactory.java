
import java.util.ArrayList;

public class RobotFactory {
	private static Fato fato;
/**
 * 	Adesso creo le liste primoNome e postfisso che ci servono per poter generare il nome 
 */
	private static final String[] primoNome = {"Astrale", "Super"
			, "Indistruttibile", "Magnifico", "Transformabile"
    };
	private static final String[] postfisso = {" astro infuocato", " uragano di luce"
			, " tenebra profonda", " muro impenetrabile", " onda dirompente"
    };	
	 
	public RobotFactory(Fato fato) {
		RobotFactory.fato = fato;
	}
	

	public static Robot crea(){
		
		return new Robot(new Nome(primoNome[fato.generaNumeroPositivo(5)],
				"Robot", fato.generaNumeroPositivo(100) + 1, postfisso[fato.generaNumeroPositivo(5)]), 
				new Testa(fato.generaNumeroPositivo(100), fato.generaNumero(10)), 
				new Corpo(fato.generaNumeroPositivo(100), fato.generaNumero(10)), 
				new Gambe(fato.generaNumeroPositivo(100), fato.generaNumero(10)));
	}
	
	
}
