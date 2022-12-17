package IGA;


public abstract class Employee {
	
	protected String nom;
	protected String prenom;
	protected int age;
	protected String daterecr;
	protected double salaireDeBase;
	protected int anneeancien;
	
	public Employee(String nom, String prenom, int age, String daterecr, double salaireDeBase, int anneeancien) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.daterecr = daterecr;
		this.salaireDeBase = salaireDeBase;
		this.anneeancien = anneeancien;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getDaterecr() {
		return daterecr;
	}
	public void setDaterecr(String daterecr) {
		this.daterecr = daterecr;
	}
	
	public double getSalaireDeBase() {
		return salaireDeBase;
	}
	public void setSalaireDeBase(double salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}
	
	public int getAnneeancien() {
		return anneeancien;
	}
	public void setAnneeancien(int anneeancien) {
		this.anneeancien = anneeancien;
	}

	public abstract String  descr();
	
	public abstract double salaire();
	
}

	
