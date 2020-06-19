

public class Gambe {
		private int potenza;
		private int velocita;
		
		public Gambe(int potenza, int velocita) {
			this.potenza = potenza;
			this.velocita = velocita;
		}
		
		public int getPotenza() {
			return potenza;
		}
		public void setPotenza(int potenza) {
			this.potenza = potenza;
		}
		public int getVelocita() {
			return velocita;
		}
		public void setVelocita(int velocita) {
			this.velocita = velocita;
		}

		@Override
		public String toString() {
			return "Gambe [potenza=" + potenza + ", velocita=" + velocita + "]";
		}

	}