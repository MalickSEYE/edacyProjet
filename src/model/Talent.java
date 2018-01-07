package model;

public class Talent {
	
		private String nom;
		private String prenom;
		private int age;
		private String niveau;
		private String cours;
		public Talent(String nom, String prenom, int age, String niveau, String cours) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
			this.niveau = niveau;
			this.cours = cours;
		}
		public String getNom() {
			return nom;
		}
	
		public String getPrenom() {
			return prenom;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getNiveau() {
			return niveau;
		}
		
		public String getCours() {
			return cours;
		}
		public void print()
		{
			System.out.println("le talent est " + getNom()+ " "+ getPrenom() + ", il est " + getNiveau() + " année et son specialite est "+ getCours());
		}
		
		
	

}
