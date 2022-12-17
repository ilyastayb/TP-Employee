package IGA;

public class Manutentionnaire extends Employee{
	
	int nb_Heures;
	float baseHoraire;
	public Manutentionnaire(String nom, String prenom, int age, String daterecr, int anneeancien, double salaireDeBase, int nb_Heures,
			float baseHoraire) {
		super(nom, prenom, age, daterecr, salaireDeBase, anneeancien);
		this.nb_Heures = nb_Heures;
		this.baseHoraire = baseHoraire;
	}
	public int getNb_Heures() {
		return nb_Heures;
	}
	public void setNb_Heures(int nb_Heures) {
		this.nb_Heures = nb_Heures;
	}
	
	public float getBaseHoraire() {
		return baseHoraire;
	}
	public void setBaseHoraire(float baseHoraire) {
		this.baseHoraire = baseHoraire;
	}
	
	
	public String descr() {
		return "Le Manutentionnaire, "+nom+" "+prenom+", de date "
				+ "d’embauche "+daterecr+" qui est le salaire: "+salaire();
	}
	
	public double salaire() {
			for (int i = 0; i < anneeancien; i++) {
				salaireDeBase = salaireDeBase + salaireDeBase * 0.05;				
			}
			return salaireDeBase + baseHoraire * nb_Heures;
	}	

}
