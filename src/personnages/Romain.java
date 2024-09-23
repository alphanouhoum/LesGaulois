package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private boolean forceValide() {
		boolean valide = true;
		if (force < 0) {
			valide = false;
		}else {
			return valide;
		}
	}  
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " :";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			
			parler("Aie");
			
		}else {
			parler("J'andonne...");
		}
		
	}
	
	public static void main(String[] args) {
		Romain obelix = new Romain("Obélix", 10);
		System.out.println(obelix.getNom());	
		obelix.prendreParole();
		obelix.parler("je suis un romain");
		obelix.recevoirCoup(9);
		
	}
	
	
	
	
}
