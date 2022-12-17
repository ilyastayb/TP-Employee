package IGA;


public class Commercial extends Employee{
	
	int chiffreAffaire;
	double partGain; 

	public Commercial(String nom, String prenom, int age, String daterecr,int anneeancien, double salaireDeBase, double partGain, int chiffreAffaire) {
		super(nom, prenom, age, daterecr, salaireDeBase, anneeancien);
		this.partGain = partGain;
		this.chiffreAffaire = chiffreAffaire;
	}

	public double getPartGain() {
		return partGain;
	}
	public void setPartGain(double partGain) {
		this.partGain = partGain;
	}
	
	public int getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(int chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public double salaire() {
		for (int i = 0; i < anneeancien; i++) {
			salaireDeBase = salaireDeBase + salaireDeBase * 0.05;
		}
		return salaireDeBase + chiffreAffaire * partGain;
	}
	
	public String descr() {
		return "Le commercial "+nom+" "+prenom+", de date "
				+ "d’embauche "+daterecr+" qui est le salaire: "+salaire();
	}

}










