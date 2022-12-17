package IGA;

public class Technicien extends Employee{
	
	int nb_Unité_Produite;
	float partGain;
	float gainUnité;
	
	public Technicien(String nom, String prenom, int age, String daterecr,int anneeancien, double salaireBase, int nb_Unité_Produite, 
			float partGain, float gainUnité) {
		super(nom, prenom, age, daterecr, salaireBase,anneeancien);
		this.nb_Unité_Produite = nb_Unité_Produite;
		this.partGain = partGain;
		this.gainUnité = gainUnité;
	}

	public int getNb_Unité_Produite() {
		return nb_Unité_Produite;
	}
	public void setNb_Unité_Produite(int nb_Unité_Produite) {
		this.nb_Unité_Produite = nb_Unité_Produite;
	}

	public float getPartGain() {
		return partGain;
	}
	public void setPartGain(float partGain) {
		this.partGain = partGain;
	}

	public float getGainUnité() {
		return gainUnité;
	}
	public void setGainUnité(float gainUnité) {
		this.gainUnité = gainUnité;
	}

	
	public String descr() {
		return "Le technicien "+nom+" "+prenom+", de date "
				+ "d’embauche "+daterecr+" qui est le salaire: "+salaire(); 
	}

	public double salaire() {
		for (int i = 0; i < anneeancien; i++) {
			salaireDeBase = salaireDeBase + salaireDeBase * 0.05;
		}
		return salaireDeBase + nb_Unité_Produite * partGain * gainUnité;
	}

	 
	

}
