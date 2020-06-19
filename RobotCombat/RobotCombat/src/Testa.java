
public class Testa {
		private int potenza;
		private int intelligenza;
		
		public Testa(int potenza, int intelligenza) {
			this.potenza = potenza;
			this.intelligenza = intelligenza;
		}
		
		public int getPotenza() {
			return potenza;
		}
		public void setPotenza(int potenza) {
			this.potenza = potenza;
		}
		public int getIntelligenza() {
			return intelligenza;
		}
		public void setIntelligenza(int intelligenza) {
			this.intelligenza = intelligenza;
		}

		@Override
		public String toString() {
			return "Testa [potenza=" + potenza + ", intelligenza=" + intelligenza + "]";
		}

	}