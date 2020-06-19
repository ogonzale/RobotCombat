

public class Corpo {
		private int potenza;
		private int robustezza;
		
		public Corpo(int potenza, int robustezza) {
			this.potenza = potenza;
			this.robustezza = robustezza;
		}
		
		public int getPotenza() {
			return potenza;
		}
		public void setPotenza(int potenza) {
			this.potenza = potenza;
		}
		public int getRobustezza() {
			return robustezza;
		}
		public void setRobustezza(int robustezza) {
			this.robustezza = robustezza;
		}

		@Override
		public String toString() {
			return "Corpo [potenza=" + potenza + ", robustezza=" + robustezza + "]";
		}

	}