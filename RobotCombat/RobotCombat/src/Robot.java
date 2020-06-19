

public class Robot {
	private Nome nome;
	private Testa testa;
	private Corpo corpo;
	private Gambe gambe;
	
	
	public Robot(Nome nome, Testa testa, Corpo corpo, Gambe gambe) {
		this.nome = nome;
		this.testa = testa;
		this.corpo = corpo;
		this.gambe = gambe;
	}
	
	public Nome getNome() {
		return nome;
	}
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	public Testa getTesta() {
		return testa;
	}
	public void setTesta(Testa testa) {
		this.testa = testa;
	}

	public Corpo getCorpo() {
		return corpo;
	}

	public void setCorpo(Corpo corpo) {
		this.corpo = corpo;
	}
	

	public Gambe getGambe() {
		return gambe;
	}

	public void setGambe(Gambe gambe) {
		this.gambe = gambe;
	}

	@Override
	public String toString() {
		return "Robot [ " + nome + ", testa=" + testa + ", corpo=" + corpo + ", gambe=" + gambe + " ]";
	}
	

}
