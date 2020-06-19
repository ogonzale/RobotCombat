
public class Nome {
	public String titolo;
	public String nomeFisso = "Robot";
	public Integer n;
	public String postfisso;
	
	public Nome(String titolo, String nomeFisso, Integer n, String postfisso) {
		this.titolo = titolo;
		this.nomeFisso = nomeFisso;
		this.n = n;
		this.postfisso = postfisso;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public String getPostfisso() {
		return postfisso;
	}

	public void setPostfisso(String postfisso) {
		this.postfisso = postfisso;
	}
	
	@Override
	public String toString() {
		return "Nome= " + titolo + nomeFisso + n + postfisso + "]";
	}
	
}
