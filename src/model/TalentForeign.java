package model;

public class TalentForeign  extends Talent{
	
		private String paysOrigine;

		

		public String getPaysOrigine() {
			return paysOrigine;
		}

		public void setPaysOrigine(String paysOrigine) {
			this.paysOrigine = paysOrigine;
		}

		public TalentForeign (String nom, String prenom, int age, String niveau, String cours, String paysOrigine) {
			super(nom, prenom, age, niveau, cours);
			this.paysOrigine = paysOrigine;
		}
		public void print()
		{
			System.out.println("le talent est " + getNom()+ " "+ getPrenom() + ", il est " + getNiveau() + " année, son specialite est "+ getCours() + "et son pays d'origine est "+getPaysOrigine());
		}
		
}
